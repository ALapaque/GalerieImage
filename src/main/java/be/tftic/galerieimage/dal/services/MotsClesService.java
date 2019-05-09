package be.tftic.galerieimage.dal.services;

import be.tftic.galerieimage.dal.entities.MotsclesEntity;
import be.tftic.galerieimage.dal.repositories.MotsClesRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class MotsClesService implements CrudService<MotsclesEntity, Integer> {

    @Autowired
    private MotsClesRepository repo;


    @Override
    public Iterable<? extends MotsclesEntity> getAll() {
        return repo.findAll();
    }

    @Override
    public Optional<MotsclesEntity> getById(Integer id) {
        return repo.findById(id);
    }

    @Override
    public MotsclesEntity create(MotsclesEntity entity) {
        return null;
    }

    @Override
    public MotsclesEntity update(MotsclesEntity entity, Integer integer) throws Exception {
        return null;
    }

    @Override
    public boolean deleteByID(Integer id) {
        return false;
    }
}
