package be.tftic.galerieimage.dal.services;

import be.tftic.galerieimage.dal.entities.Roles;
import be.tftic.galerieimage.dal.repositories.RolesRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class RolesService implements CrudService<Roles, Integer> {

    @Autowired
    private RolesRepository repo;


    @Override
    public Iterable<? extends Roles> getAll() {
        return repo.findAll();
    }

    @Override
    public Optional<Roles> getById(Integer id) {
        return repo.findById(id);
    }

    @Override
    public Roles create(Roles entity) {
        return null;
    }

    @Override
    public Roles update(Roles entity, Integer integer) throws Exception {
        return null;
    }

    @Override
    public boolean deleteByID(Integer id) {
        return false;
    }
}
