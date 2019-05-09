package be.tftic.galerieimage.dal.entities;

import com.fasterxml.jackson.annotation.*;
import lombok.Data;
import javax.persistence.*;
import java.util.List;
import java.util.Set;


@Entity
@Table(name = "utilisateurs")
@Data
@JsonIdentityInfo(
        generator = ObjectIdGenerators.PropertyGenerator.class,
        property = "id")
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

    @OneToMany(mappedBy = "utilisateur", cascade = CascadeType.ALL)
    private Set<Images> images;

    @ManyToOne
    @JoinColumn(name = "Roles_ID")
    private Roles role;


}
