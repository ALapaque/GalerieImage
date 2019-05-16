package be.tftic.galerieimage.dal.services;

import be.tftic.galerieimage.dal.entitites.Utilisateur;

import java.util.List;

public interface GenericService {
    Utilisateur findByUsername(String username);

    List<Utilisateur> findAllUsers();

}
