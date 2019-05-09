package be.tftic.galerieimage.controllers;

import be.tftic.galerieimage.dal.entities.MotsclesEntity;
import be.tftic.galerieimage.dal.services.MotsClesService;
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
public class MotsClesController {

    @Autowired
    private MotsClesService service;

    @GetMapping("")
    public ResponseEntity<List<MotsclesEntity>> getAll(){

        return new ResponseEntity<List<MotsclesEntity>>((List<MotsclesEntity>) service.getAll(), HttpStatus.OK);
    }

    @GetMapping("/{id}")
    public ResponseEntity<Optional<MotsclesEntity>> getByID(@PathVariable("id") int id){

        return new ResponseEntity<Optional<MotsclesEntity>>(service.getById(id), HttpStatus.OK);
    }
}
