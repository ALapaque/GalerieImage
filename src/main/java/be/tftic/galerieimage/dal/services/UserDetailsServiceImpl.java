package be.tftic.galerieimage.dal.services;

import be.tftic.galerieimage.dal.entitites.Utilisateur;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.authority.SimpleGrantedAuthority;
import org.springframework.security.core.userdetails.User;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.Optional;

@Service("userDetailsServiceImpl")
public class UserDetailsServiceImpl implements UserDetailsService {

    private final AccountService accountService;

    @Autowired
    public UserDetailsServiceImpl(AccountService accountService){
        this.accountService = accountService;
    }
    @Override
    public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
        Utilisateur utilisateur = accountService.findUserByUsername(username);
        if(utilisateur == null){
            new UsernameNotFoundException(username);
        }

        ArrayList<GrantedAuthority> authorities = new ArrayList<>();

        utilisateur.getRole().getPermissions().forEach(permission -> authorities.add(new SimpleGrantedAuthority(permission.getNom())));
        authorities.add(new SimpleGrantedAuthority(utilisateur.getRole().getNom()));
        return new User(utilisateur.getUsername(), utilisateur.getPassword(), authorities);
    }
}
