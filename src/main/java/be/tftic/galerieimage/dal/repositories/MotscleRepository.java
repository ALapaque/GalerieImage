package be.tftic.galerieimage.dal.repositories;

import be.tftic.galerieimage.dal.entitites.Motscle;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface MotscleRepository extends JpaRepository<Motscle, Integer> {
}
