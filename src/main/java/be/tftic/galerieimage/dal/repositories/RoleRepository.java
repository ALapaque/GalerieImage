package be.tftic.galerieimage.dal.repositories;

import be.tftic.galerieimage.dal.entitites.Role;
import be.tftic.galerieimage.dal.entitites.RoleName;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface RoleRepository extends JpaRepository<Role, Long> {
    Optional<Role> findByName(RoleName roleName);
}
