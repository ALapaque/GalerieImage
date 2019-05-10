package be.tftic.galerieimage.dal.repositories;

import be.tftic.galerieimage.dal.entitites.Permission;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import javax.persistence.criteria.CriteriaBuilder;

@Repository
public interface PermissionRepository extends JpaRepository<Permission, Integer> {
}
