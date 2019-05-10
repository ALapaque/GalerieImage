package be.tftic.galerieimage.controllers;

import be.tftic.galerieimage.dal.entitites.Image;
import be.tftic.galerieimage.dal.entitites.Motscle;
import be.tftic.galerieimage.dal.services.MotscleService;
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
@RequestMapping("/motscle")
public class MotscleController {

    @Autowired
    private MotscleService service;

    @GetMapping("")
    public ResponseEntity<List<Motscle>> getAll(){

        return new ResponseEntity<List<Motscle>>((List<Motscle>) service.getAll(), HttpStatus.OK);
    }

    @GetMapping("/{id}")
    public ResponseEntity<Optional<Motscle>> getById(@PathVariable("id") int id){

        return new ResponseEntity<Optional<Motscle>>(service.getById(id), HttpStatus.OK);
    }
}
