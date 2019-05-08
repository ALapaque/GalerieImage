package be.tftic.galerieimage.dal.services;

import be.tftic.galerieimage.dal.entities.MotsCles;
import be.tftic.galerieimage.dal.repositories.MotsClesRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class MotsClesService implements CrudService<MotsCles, Integer> {

    @Autowired
    private MotsClesRepository repo;


    @Override
    public Iterable<? extends MotsCles> getAll() {
        return repo.findAll();
    }

    @Override
    public Optional<MotsCles> getById(Integer id) {
        return repo.findById(id);
    }

    @Override
    public MotsCles create(MotsCles entity) {
        return null;
    }

    @Override
    public MotsCles update(MotsCles entity, Integer integer) throws Exception {
        return null;
    }

    @Override
    public boolean deleteByID(Integer id) {
        return false;
    }
}
