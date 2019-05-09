package be.tftic.galerieimage.dal.services;

import be.tftic.galerieimage.dal.entities.UtilisateursEntity;
import be.tftic.galerieimage.dal.repositories.UtilisateursRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class UtilisateursService implements CrudService<UtilisateursEntity, Integer> {

    @Autowired
    private UtilisateursRepository repo;


    @Override
    public Iterable<? extends UtilisateursEntity> getAll() {
        return repo.findAll();
    }

    @Override
    public Optional<UtilisateursEntity> getById(Integer id) {
        return repo.findById(id);
    }

    @Override
    public UtilisateursEntity create(UtilisateursEntity entity) {
        return null;
    }

    @Override
    public UtilisateursEntity update(UtilisateursEntity entity, Integer integer) throws Exception {
        return null;
    }

    @Override
    public boolean deleteByID(Integer id) {
        return false;
    }
}
