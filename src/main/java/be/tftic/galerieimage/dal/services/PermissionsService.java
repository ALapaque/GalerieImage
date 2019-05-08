package be.tftic.galerieimage.dal.services;

import be.tftic.galerieimage.dal.entities.Permissions;
import be.tftic.galerieimage.dal.repositories.PermissionsRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class PermissionsService implements CrudService<Permissions, Integer> {

    @Autowired
    private PermissionsRepository repo;


    @Override
    public Iterable<? extends Permissions> getAll() {
        return repo.findAll();
    }

    @Override
    public Optional<Permissions> getById(Integer id) {
        return repo.findById(id);
    }

    @Override
    public Permissions create(Permissions entity) {
        return null;
    }

    @Override
    public Permissions update(Permissions entity, Integer integer) throws Exception {
        return null;
    }

    @Override
    public boolean deleteByID(Integer id) {
        return false;
    }
}
