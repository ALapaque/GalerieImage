package be.tftic.galerieimage.dal.repositories;

import be.tftic.galerieimage.dal.entitites.Image;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ImagesRepository extends JpaRepository<Image, Integer> {
}
