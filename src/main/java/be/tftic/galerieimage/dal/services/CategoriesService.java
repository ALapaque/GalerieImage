package be.tftic.galerieimage.dal.services;

import be.tftic.galerieimage.dal.entities.Categories;
import be.tftic.galerieimage.dal.repositories.CategoriesRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class CategoriesService implements  CrudService<Categories, Integer> {

    @Autowired
    private CategoriesRepository repo;


    @Override
    public Iterable<? extends Categories> getAll() {
        return repo.findAll();
    }

    @Override
    public Optional<Categories> getById(Integer id) {
        return repo.findById(id);
    }

    @Override
    public Categories create(Categories entity) {
        return null;
    }

    @Override
    public Categories update(Categories entity, Integer integer) throws Exception {
        return null;
    }

    @Override
    public boolean deleteByID(Integer id) {
        return false;
    }
}
