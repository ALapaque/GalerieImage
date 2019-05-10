package be.tftic.galerieimage.dal.services;

import be.tftic.galerieimage.dal.entitites.Image;
import be.tftic.galerieimage.dal.repositories.ImagesRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class ImagesService implements CrudService<Image, Integer> {

    @Autowired
    private ImagesRepository repo;


    @Override
    public Iterable<? extends Image> getAll() {
        return repo.findAll();
    }

    @Override
    public Optional<Image> getById(Integer id) {
        return repo.findById(id);
    }

    @Override
    public Image create(Image entity) {
        return null;
    }

    @Override
    public Image update(Image entity, Integer integer) throws Exception {
        return null;
    }

    @Override
    public boolean deleteByID(Integer id) {
        return false;
    }
}
