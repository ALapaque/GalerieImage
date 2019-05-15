package be.tftic.galerieimage.dal.repositories;

import be.tftic.galerieimage.dal.entitites.Utilisateur;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface UtilisateurRepository extends JpaRepository<Utilisateur, Integer> {

    Optional<Utilisateur> findByUsername(String username);
}
