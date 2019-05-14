package be.tftic.galerieimage.dal.repositories;

import be.tftic.galerieimage.dal.entitites.DBFile;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface DBFileRepository extends JpaRepository<DBFile, String> {

}
