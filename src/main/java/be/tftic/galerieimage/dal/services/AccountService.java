package be.tftic.galerieimage.dal.services;

import be.tftic.galerieimage.dal.entitites.Utilisateur;

public interface AccountService {

    Utilisateur findUserByUsername(String code);
}
