package be.tftic.galerieimage.controllers;

import be.tftic.galerieimage.dal.entities.CategoriesEntity;
import be.tftic.galerieimage.dal.services.CategoriesService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/category")
public class CategoriesController {

    @Autowired
    private CategoriesService service;

    @GetMapping("")
    public ResponseEntity<List<CategoriesEntity>> getAll(){
        return new ResponseEntity<List<CategoriesEntity>>((List<CategoriesEntity>) service.getAll(), HttpStatus.OK);
    }

    @GetMapping("/{id}")
    public ResponseEntity<Optional<CategoriesEntity>> getById(@PathVariable("id") int id){

        return new ResponseEntity<Optional<CategoriesEntity>>(service.getById(id), HttpStatus.OK);
    }

}
