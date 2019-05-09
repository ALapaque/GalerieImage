package be.tftic.galerieimage.dal.services;

import be.tftic.galerieimage.dal.entities.ImagesEntity;
import be.tftic.galerieimage.dal.repositories.ImagesRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class ImagesService implements CrudService<ImagesEntity, Integer> {

    @Autowired
    private ImagesRepository repo;


    @Override
    public Iterable<? extends ImagesEntity> getAll() {
        return repo.findAll();
    }

    @Override
    public Optional<ImagesEntity> getById(Integer id) {
        return repo.findById(id);
    }

    @Override
    public ImagesEntity create(ImagesEntity entity) {
        return null;
    }

    @Override
    public ImagesEntity update(ImagesEntity entity, Integer integer) throws Exception {
        return null;
    }

    @Override
    public boolean deleteByID(Integer id) {
        return false;
    }
}
