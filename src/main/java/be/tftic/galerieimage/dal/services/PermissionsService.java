package be.tftic.galerieimage.dal.services;

import be.tftic.galerieimage.dal.entities.PermissionsEntity;
import be.tftic.galerieimage.dal.repositories.PermissionsRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.security.Permissions;
import java.util.Optional;

@Service
public class PermissionsService implements CrudService<PermissionsEntity, Integer> {

    @Autowired
    private PermissionsRepository repo;


    @Override
    public Iterable<? extends PermissionsEntity> getAll() {
        return repo.findAll();
    }

    @Override
    public Optional<PermissionsEntity> getById(Integer id) {
        return repo.findById(id);
    }

    @Override
    public PermissionsEntity create(PermissionsEntity entity) {
        return null;
    }

    @Override
    public PermissionsEntity update(PermissionsEntity entity, Integer integer) throws Exception {
        return null;
    }

    @Override
    public boolean deleteByID(Integer id) {
        return false;
    }
}
