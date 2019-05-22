package be.tftic.galerieimage.dal.repositories;

import be.tftic.galerieimage.dal.entitites.Category;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CategoriesRepository extends JpaRepository<Category, Long> {
}
