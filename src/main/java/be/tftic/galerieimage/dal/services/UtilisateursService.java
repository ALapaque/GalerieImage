package be.tftic.galerieimage.dal.services;

import be.tftic.galerieimage.dal.entities.Utilisateurs;
import be.tftic.galerieimage.dal.repositories.UtilisateursRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class UtilisateursService implements CrudService<Utilisateurs, Integer> {

    @Autowired
    private UtilisateursRepository repo;


    @Override
    public Iterable<? extends Utilisateurs> getAll() {
        return repo.findAll();
    }

    @Override
    public Optional<Utilisateurs> getById(Integer id) {
        return repo.findById(id);
    }

    @Override
    public Utilisateurs create(Utilisateurs entity) {
        return null;
    }

    @Override
    public Utilisateurs update(Utilisateurs entity, Integer integer) throws Exception {
        return null;
    }

    @Override
    public boolean deleteByID(Integer id) {
        return false;
    }
}
