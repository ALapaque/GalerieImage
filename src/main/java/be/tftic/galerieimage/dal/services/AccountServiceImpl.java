package be.tftic.galerieimage.dal.services;

import be.tftic.galerieimage.dal.entitites.Utilisateur;
import be.tftic.galerieimage.dal.repositories.PermissionRepository;
import be.tftic.galerieimage.dal.repositories.RoleRepository;
import be.tftic.galerieimage.dal.repositories.UtilisateurRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.stereotype.Service;

@Service
public class AccountServiceImpl implements AccountService {
    @Autowired
    private BCryptPasswordEncoder bCryptPasswordEncoder;

    @Autowired
    private UtilisateurRepository utilisateurRepository;

    @Autowired
    private RoleRepository roleRepository;

    @Autowired
    private PermissionRepository permissionRepository;

    @Override
    public Utilisateur findUserByUsername(String code) {
        return utilisateurRepository.findByUsername(code);
    }
}
