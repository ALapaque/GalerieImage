package be.tftic.galerieimage.dal.services;

import be.tftic.galerieimage.dal.entitites.Role;
import be.tftic.galerieimage.dal.repositories.RoleRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class RoleService implements CrudService<Role, Integer> {

    @Autowired
    private RoleRepository repo;

    @Override
    public Iterable<? extends Role> getAll() {
        return repo.findAll();
    }

    @Override
    public Optional<Role> getById(Integer id) {
        return repo.findById(id);
    }

    @Override
    public Role create(Role entity) {
        return null;
    }

    @Override
    public Role update(Role entity, Integer integer) throws Exception {
        return null;
    }

    @Override
    public boolean deleteByID(Integer id) {
        return false;
    }
}
