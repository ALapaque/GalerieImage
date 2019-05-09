package be.tftic.galerieimage.dal.services;

import be.tftic.galerieimage.dal.entities.CategoriesEntity;
import be.tftic.galerieimage.dal.repositories.CategoriesRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class CategoriesService implements  CrudService<CategoriesEntity, Integer> {

    @Autowired
    private CategoriesRepository repo;


    @Override
    public Iterable<? extends CategoriesEntity> getAll() {
        return repo.findAll();
    }

    @Override
    public Optional<CategoriesEntity> getById(Integer id) {
        return repo.findById(id);
    }

    @Override
    public CategoriesEntity create(CategoriesEntity entity) {
        return null;
    }

    @Override
    public CategoriesEntity update(CategoriesEntity entity, Integer integer) throws Exception {
        return null;
    }

    @Override
    public boolean deleteByID(Integer id) {
        return false;
    }
}
