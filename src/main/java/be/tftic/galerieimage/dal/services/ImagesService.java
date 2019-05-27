package be.tftic.galerieimage.dal.services;

import be.tftic.galerieimage.Exception.FileStorageException;
import be.tftic.galerieimage.Exception.MyFileNotFoundException;
import be.tftic.galerieimage.dal.entitites.Image;
import be.tftic.galerieimage.dal.repositories.ImagesRepository;
import be.tftic.galerieimage.property.ImageStorageProperties;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.io.Resource;
import org.springframework.core.io.UrlResource;
import org.springframework.stereotype.Service;
import org.springframework.util.StringUtils;
import org.springframework.web.multipart.MultipartFile;

import java.io.IOException;
import java.net.MalformedURLException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.StandardCopyOption;
import java.util.Optional;

@Service
public class ImagesService implements CrudService<Image, Long> {

    @Autowired
    private ImagesRepository repo;

    private final Path fileStorageLocation;

    @Autowired
    public ImagesService(ImageStorageProperties fileStorageProperties) {
        this.fileStorageLocation = Paths.get(fileStorageProperties.getUploadDir())
                .toAbsolutePath().normalize();

        try {
            Files.createDirectories(this.fileStorageLocation);
        } catch (Exception ex) {
            throw new FileStorageException("Could not create the directory where the uploaded files will be stored.", ex);
        }
    }

    public String storeFile(MultipartFile file) {
        // Normalize file name
        String fileName = StringUtils.cleanPath(file.getOriginalFilename());

        try {
            // Check if the file's name contains invalid characters
            if(fileName.contains("..")) {
                throw new FileStorageException("Sorry! Filename contains invalid path sequence " + fileName);
            }

            // Copy file to the target location (Replacing existing file with the same name)
            Path targetLocation = this.fileStorageLocation.resolve(fileName);
            Files.copy(file.getInputStream(), targetLocation, StandardCopyOption.REPLACE_EXISTING);

            return fileName;
        } catch (IOException ex) {
            throw new FileStorageException("Could not store file " + fileName + ". Please try again!", ex);
        }
    }

    public Resource loadFileAsResource(String fileName) {
        try {
            Path filePath = this.fileStorageLocation.resolve(fileName).normalize();
            Resource resource = new UrlResource(filePath.toUri());
            if(resource.exists()) {
                return resource;
            } else {
                throw new MyFileNotFoundException("File not found " + fileName);
            }
        } catch (MalformedURLException ex) {
            throw new MyFileNotFoundException("File not found " + fileName, ex);
        }
    }


    @Override
    public Iterable<? extends Image> getAll() {
        return repo.findAll();
    }

    @Override
    public Optional<Image> getById(Long id) {
        return repo.findById(id);
    }


    @Override
    public Image create(Image entity) {
        return repo.save(entity);
    }

    @Override
    public Image update(Image entity, Long id) throws Exception {
        Image i = getById(id).orElseThrow(() -> new Exception("Image's ID not found"));
        i.setDescription(entity.getDescription());
        return repo.save(i);
    }

    @Override
    public boolean deleteByID(Long id) {
        repo.deleteById(id);

        //Retourne true si le delete a été fait
        return !repo.existsById(id);
    }

}
