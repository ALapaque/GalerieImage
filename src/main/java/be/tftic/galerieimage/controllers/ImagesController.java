package be.tftic.galerieimage.controllers;

import be.tftic.galerieimage.dal.entities.Images;
import be.tftic.galerieimage.dal.services.ImagesService;
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
@RequestMapping("/image")
public class ImagesController {

    @Autowired
    private ImagesService service;

    @GetMapping("")
    public ResponseEntity<List<Images>> getAll(){

        return new ResponseEntity<List<Images>>((List<Images>) service.getAll(), HttpStatus.OK);
    }

    @GetMapping("/{id}")
    public ResponseEntity<Optional<Images>> getById(@PathVariable("id") int id){

        return new ResponseEntity<Optional<Images>>(service.getById(id), HttpStatus.OK);
    }
}
