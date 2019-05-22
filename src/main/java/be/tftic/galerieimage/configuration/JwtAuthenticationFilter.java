package be.tftic.galerieimage.configuration;


import be.tftic.galerieimage.dal.entitites.Utilisateur;
import com.fasterxml.jackson.databind.ObjectMapper;
import io.jsonwebtoken.Jwts;
import io.jsonwebtoken.SignatureAlgorithm;
import org.springframework.security.authentication.AuthenticationManager;
import org.springframework.security.authentication.UsernamePasswordAuthenticationToken;
import org.springframework.security.core.Authentication;
import org.springframework.security.core.AuthenticationException;
import org.springframework.security.web.authentication.UsernamePasswordAuthenticationFilter;
import org.springframework.security.core.userdetails.User;
import javax.servlet.FilterChain;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.Date;

import static be.tftic.galerieimage.configuration.SecurityConstants.*;

public class JwtAuthenticationFilter extends UsernamePasswordAuthenticationFilter {

    private AuthenticationManager authenticationManager;

    public JwtAuthenticationFilter(AuthenticationManager authenticationManager){
        this.authenticationManager = authenticationManager;
    }

    @Override
    public Authentication attemptAuthentication(HttpServletRequest request, HttpServletResponse response) throws AuthenticationException {
        Utilisateur utilisateur = null;
        try{
            utilisateur = new ObjectMapper().readValue(request.getInputStream(),Utilisateur.class);
        }catch (Exception e){
            throw new RuntimeException(e);
        }
        return authenticationManager.authenticate(new UsernamePasswordAuthenticationToken(utilisateur.getUsername(),utilisateur.getPassword()));
    }

    @Override
    protected void successfulAuthentication(HttpServletRequest request, HttpServletResponse response, FilterChain chain, Authentication authResult) throws IOException, ServletException {

        User springUser =  (User) authResult.getPrincipal();
        String jwtToken = Jwts.builder().setSubject(springUser.getUsername())
                .setExpiration(new Date(System.currentTimeMillis()+ EXPIRATION_TIME))
                .signWith(SignatureAlgorithm.HS512, SECRET)
                .claim("roles",springUser.getAuthorities()).compact();
        response.addHeader(HEADER_STRING, TOKEN_PREFIX+jwtToken);
        Utilisateur utilisateur = new Utilisateur();
        utilisateur.setUsername(springUser.getUsername());
        request.setAttribute("Object", utilisateur);
        request.getRequestDispatcher("/login").forward(request,response);
    }
}
