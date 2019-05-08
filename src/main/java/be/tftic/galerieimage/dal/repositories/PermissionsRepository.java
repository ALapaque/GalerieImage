package be.tftic.galerieimage.dal.repositories;

import be.tftic.galerieimage.dal.entities.Permissions;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface PermissionsRepository extends JpaRepository<Permissions, Integer> {
}
