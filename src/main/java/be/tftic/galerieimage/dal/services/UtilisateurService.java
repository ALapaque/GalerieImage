package be.tftic.galerieimage.dal.services;


import be.tftic.galerieimage.dal.entitites.Utilisateur;
import be.tftic.galerieimage.dal.repositories.UtilisateurRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

import java.util.Objects;
import java.util.Optional;

@Service
public class UtilisateurService implements CrudService<Utilisateur, Integer>, UserDetailsService {

    @Autowired
    private UtilisateurRepository repo;

    @Override
    public Iterable<? extends Utilisateur> getAll() {
        return repo.findAll();
    }

    @Override
    public Optional<Utilisateur> getById(Integer id) {
        return repo.findById(id);
    }

    @Override
    public Utilisateur create(Utilisateur entity) {
        return repo.save(entity);
    }

    @Override
    public Utilisateur update(Utilisateur entity, Integer integer) throws Exception {
        return null;
    }

    @Override
    public boolean deleteByID(Integer id) {
        return false;
    }

    @Override
    public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
        Objects.requireNonNull(username);
        Utilisateur u = repo.findByUsername(username).orElseThrow(() -> new UsernameNotFoundException("User not found !"));
        return u;
    }
}