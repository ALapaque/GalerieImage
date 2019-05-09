package be.tftic.galerieimage.controllers;

import be.tftic.galerieimage.dal.entities.PermissionsEntity;
import be.tftic.galerieimage.dal.services.PermissionsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.security.Permissions;
import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/permission")
public class PermissionsController {

    @Autowired
    private PermissionsService service;

    @GetMapping("")
    public ResponseEntity<List<PermissionsEntity>> getAll(){

        return new ResponseEntity<List<PermissionsEntity>>((List<PermissionsEntity>) service.getAll(), HttpStatus.OK);
    }

    @GetMapping("/{id}")
    public ResponseEntity<Optional<PermissionsEntity>> getById(@PathVariable("id") int id){

        return new ResponseEntity<Optional<PermissionsEntity>>(service.getById(id), HttpStatus.OK);
    }

}
