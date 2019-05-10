package be.tftic.galerieimage.dal.services;

import be.tftic.galerieimage.dal.entitites.Permission;
import be.tftic.galerieimage.dal.repositories.PermissionRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class PermissionService implements CrudService<Permission, Integer> {

    @Autowired
    private PermissionRepository repo;

    @Override
    public Iterable<? extends Permission> getAll() {
        return repo.findAll();
    }

    @Override
    public Optional<Permission> getById(Integer id) {
        return repo.findById(id);
    }

    @Override
    public Permission create(Permission entity) {
        return null;
    }

    @Override
    public Permission update(Permission entity, Integer integer) throws Exception {
        return null;
    }

    @Override
    public boolean deleteByID(Integer id) {
        return false;
    }
}
