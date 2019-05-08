package be.tftic.galerieimage.dal.repositories;

import be.tftic.galerieimage.dal.entities.Roles;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface RolesRepository extends JpaRepository<Roles, Integer> {
}
