package be.tftic.galerieimage.dal.repositories;

import be.tftic.galerieimage.dal.entitites.Role;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface RoleRepository extends JpaRepository<Role, Integer> {
}
