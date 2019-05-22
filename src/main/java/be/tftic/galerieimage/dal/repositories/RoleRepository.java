package be.tftic.galerieimage.dal.repositories;

import be.tftic.galerieimage.dal.entitites.Role;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface RoleRepository extends JpaRepository<Role, Integer> {

    Optional<Role> findByName(Role roleName);
}
