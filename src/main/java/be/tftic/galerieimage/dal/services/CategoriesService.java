package be.tftic.galerieimage.dal.services;

import be.tftic.galerieimage.dal.entitites.Category;
import be.tftic.galerieimage.dal.repositories.CategoriesRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class CategoriesService implements  CrudService<Category, Long> {

    @Autowired
    private CategoriesRepository repo;


    @Override
    public Iterable<? extends Category> getAll() {
        return repo.findAll();
    }

    @Override
    public Optional<Category> getById(Long id) {
        return repo.findById(id);
    }


    @Override
    public Category create(Category entity) {
        return repo.save(entity);
    }

    @Override
    public Category update(Category entity, Long aLong) throws Exception {
        return null;
    }

    @Override
    public boolean deleteByID(Long id) {
        return false;
    }

}
