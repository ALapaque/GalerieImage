package be.tftic.galerieimage.dal.repositories;

import be.tftic.galerieimage.dal.entities.Utilisateurs;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UtilisateursRepository extends JpaRepository<Utilisateurs, Integer> {
}
