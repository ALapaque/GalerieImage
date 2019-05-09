package be.tftic.galerieimage.dal.services;

import be.tftic.galerieimage.dal.entities.RolesEntity;
import be.tftic.galerieimage.dal.repositories.RolesRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class RolesService implements CrudService<RolesEntity, Integer> {

    @Autowired
    private RolesRepository repo;


    @Override
    public Iterable<? extends RolesEntity> getAll() {
        return repo.findAll();
    }

    @Override
    public Optional<RolesEntity> getById(Integer id) {
        return repo.findById(id);
    }

    @Override
    public RolesEntity create(RolesEntity entity) {
        return null;
    }

    @Override
    public RolesEntity update(RolesEntity entity, Integer integer) throws Exception {
        return null;
    }

    @Override
    public boolean deleteByID(Integer id) {
        return false;
    }
}
