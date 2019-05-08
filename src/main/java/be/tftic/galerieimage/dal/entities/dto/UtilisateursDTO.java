package be.tftic.galerieimage.dal.entities.dto;

import com.fasterxml.jackson.annotation.JsonIdentityInfo;
import com.fasterxml.jackson.annotation.ObjectIdGenerators;
import lombok.Data;

import javax.persistence.*;

@Entity
@Table(name = "utilisateurs")
@Data
public class UtilisateursDTO {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    private byte delete;

    private String email;

    private String nom;

    private String password;

    private String prenom;

    private String username;

}
