package be.tftic.galerieimage.dal.entities;

import com.fasterxml.jackson.annotation.JsonBackReference;
import com.fasterxml.jackson.annotation.JsonIdentityInfo;
import com.fasterxml.jackson.annotation.JsonManagedReference;
import com.fasterxml.jackson.annotation.ObjectIdGenerators;
import lombok.Data;

import javax.persistence.*;
import java.util.List;

@Entity
@Table(name = "images")
@Data
public class Images {

    @Id
    @GeneratedValue(strategy=GenerationType.IDENTITY)
    private int id;

    private byte delete;

    private String description;

    private int like;

    private String nom;

    private String src;

    //bi-directional many-to-one association to Utilisateur
    @ManyToOne(cascade = CascadeType.ALL)
    @JoinColumn(name="Utilisateurs_ID")
    @JsonBackReference
    private Utilisateurs utilisateur;

    //bi-directional many-to-many association to Category
    @ManyToMany
    @JoinTable(
            name="images_has_categories"
            , joinColumns={
            @JoinColumn(name="Images_ID")
    }
            , inverseJoinColumns={
            @JoinColumn(name="Categories_ID")
    }
    )
    @JsonBackReference
    private List<Categories> categories;

    //bi-directional many-to-many association to Motscle
    @ManyToMany(mappedBy="images")
    @JsonBackReference
    private List<MotsCles> motscles;
}
