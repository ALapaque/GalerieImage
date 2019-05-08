package be.tftic.galerieimage.dal.repositories;

import be.tftic.galerieimage.dal.entities.MotsCles;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface MotsClesRepository extends JpaRepository<MotsCles, Integer> {
}
