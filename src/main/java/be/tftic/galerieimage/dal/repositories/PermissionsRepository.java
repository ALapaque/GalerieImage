package be.tftic.galerieimage.dal.repositories;

import be.tftic.galerieimage.dal.entities.PermissionsEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.security.Permissions;

@Repository
public interface PermissionsRepository extends JpaRepository<PermissionsEntity, Integer> {
}
