package be.tftic.galerieimage.controllers;

import be.tftic.galerieimage.dal.entitites.Category;
import be.tftic.galerieimage.dal.services.CategoriesService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/category")
@CrossOrigin
public class CategoriesController {

    @Autowired
    private CategoriesService service;

    @GetMapping("")
    public ResponseEntity<List<Category>> getAll(){
        return new ResponseEntity<List<Category>>((List<Category>) service.getAll(), HttpStatus.OK);
    }

    @GetMapping("/{id}")
    public ResponseEntity<Optional<Category>> getById(@PathVariable("id") int id){

        return new ResponseEntity<Optional<Category>>(service.getById(id), HttpStatus.OK);
    }

}
