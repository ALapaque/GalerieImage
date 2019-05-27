package be.tftic.galerieimage.dal.services;

import be.tftic.galerieimage.dal.entitites.Motscle;
import be.tftic.galerieimage.dal.repositories.MotscleRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class MotscleService implements CrudService<Motscle, Long> {

    @Autowired
    private MotscleRepository repo;

    @Override
    public Iterable<? extends Motscle> getAll() {
        return repo.findAll();
    }

    @Override
    public Optional<Motscle> getById(Long id) {
        return repo.findById(id);
    }

    @Override
    public Motscle create(Motscle entity) {
        return repo.save(entity);
    }

    @Override
    public Motscle update(Motscle entity, Long aLong) throws Exception {
        return null;
    }

    @Override
    public boolean deleteByID(Long id) {
        repo.deleteById(id);

        //return true s'il ne trouve pas l'ID
        return !repo.existsById(id);
    }

}
