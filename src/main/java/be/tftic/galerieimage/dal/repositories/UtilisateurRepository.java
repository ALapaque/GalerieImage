package be.tftic.galerieimage.dal.repositories;

import be.tftic.galerieimage.dal.entitites.Utilisateur;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;

@Repository
public interface UtilisateurRepository extends JpaRepository<Utilisateur, Integer> {

    Optional<Utilisateur> findByEmail(String email);

    Optional<Utilisateur> findByUsernameOrEmail(String username, String email);

    List<Utilisateur> findByIdIn(List<Long> userIds);

    Utilisateur findByUsername(String username);

    Boolean existsByUsername(String username);

    Boolean existsByEmail(String email);
}
