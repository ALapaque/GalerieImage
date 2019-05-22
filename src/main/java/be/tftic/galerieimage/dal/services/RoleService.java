package be.tftic.galerieimage.dal.services;

import be.tftic.galerieimage.dal.entitites.Role;
import be.tftic.galerieimage.dal.repositories.RoleRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class RoleService implements CrudService<Role, Long> {

    @Autowired
    private RoleRepository repo;

    @Override
    public Iterable<? extends Role> getAll() {
        return repo.findAll();
    }

    @Override
    public Optional<Role> getById(Long id) {
        return repo.findById(id);
    }

    @Override
    public Role create(Role entity) {
        return null;
    }

    @Override
    public Role update(Role entity, Long aLong) throws Exception {
        return null;
    }

    @Override
    public boolean deleteByID(Long id) {
        return false;
    }

}
