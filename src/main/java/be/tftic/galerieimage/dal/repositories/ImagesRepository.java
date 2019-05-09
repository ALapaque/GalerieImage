package be.tftic.galerieimage.dal.repositories;

import be.tftic.galerieimage.dal.entities.ImagesEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ImagesRepository extends JpaRepository<ImagesEntity, Integer> {
}
