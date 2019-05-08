package be.tftic.galerieimage.dal.services;

import be.tftic.galerieimage.dal.entities.Images;
import be.tftic.galerieimage.dal.repositories.ImagesRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class ImagesService implements CrudService<Images, Integer> {

    @Autowired
    private ImagesRepository repo;


    @Override
    public Iterable<? extends Images> getAll() {
        return repo.findAll();
    }

    @Override
    public Optional<Images> getById(Integer id) {
        return repo.findById(id);
    }

    @Override
    public Images create(Images entity) {
        return null;
    }

    @Override
    public Images update(Images entity, Integer integer) throws Exception {
        return null;
    }

    @Override
    public boolean deleteByID(Integer id) {
        return false;
    }
}
