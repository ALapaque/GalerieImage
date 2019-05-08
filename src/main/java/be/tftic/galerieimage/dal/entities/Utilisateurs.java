package be.tftic.galerieimage.dal.entities;

import com.fasterxml.jackson.annotation.JsonBackReference;
import com.fasterxml.jackson.annotation.JsonIdentityInfo;
import com.fasterxml.jackson.annotation.JsonManagedReference;
import com.fasterxml.jackson.annotation.ObjectIdGenerators;
import lombok.Data;
import javax.persistence.*;
import java.util.List;


@Entity
@Table(name = "utilisateurs")
@Data
public class Utilisateurs {

    @Id
    @GeneratedValue(strategy=GenerationType.IDENTITY)
    private int id;

    private byte delete;

    private String email;

    private String nom;

    private String password;

    private String prenom;

    private String username;

    //bi-directional many-to-one association to Image
    @OneToMany(mappedBy="utilisateur")
    private List<Images> images;

    //bi-directional many-to-one association to Role
    @ManyToOne
    @JoinColumn(name="Roles_ID")
    private Roles role;
}
