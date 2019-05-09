package be.tftic.galerieimage.dal.entities;

import com.fasterxml.jackson.annotation.JsonBackReference;
import com.fasterxml.jackson.annotation.JsonManagedReference;
import lombok.Data;

import javax.persistence.*;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

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

    @ManyToOne
    @JoinColumn(name="Utilisateurs_ID")
    private Utilisateurs utilisateur;

    @ManyToMany(cascade = CascadeType.ALL)
    @JoinTable(name = "images_has_categories",
        joinColumns = @JoinColumn(name = "Images_ID", referencedColumnName = "ID"),
        inverseJoinColumns = @JoinColumn(name = "Categories_ID", referencedColumnName = "ID"))
    private Set<Categories> categories;


    @ManyToMany(mappedBy = "images")
    private Set<MotsCles> motsCles = new HashSet<>();

}
