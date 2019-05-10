package be.tftic.galerieimage.dal.services;

import be.tftic.galerieimage.dal.entitites.Motscle;
import be.tftic.galerieimage.dal.repositories.MotscleRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class MotscleService implements CrudService<Motscle, Integer> {

    @Autowired
    private MotscleRepository repo;

    @Override
    public Iterable<? extends Motscle> getAll() {
        return repo.findAll();
    }

    @Override
    public Optional<Motscle> getById(Integer id) {
        return repo.findById(id);
    }

    @Override
    public Motscle create(Motscle entity) {
        return null;
    }

    @Override
    public Motscle update(Motscle entity, Integer integer) throws Exception {
        return null;
    }

    @Override
    public boolean deleteByID(Integer id) {
        return false;
    }
}
