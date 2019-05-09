package be.tftic.galerieimage.dal.entities;

import com.fasterxml.jackson.annotation.JsonBackReference;
import lombok.Data;

import javax.persistence.*;
import java.util.List;
import java.util.Set;

@Entity
@Table(name = "motscles")
@Data
public class MotsCles {

    @Id
    @GeneratedValue(strategy=GenerationType.IDENTITY)
    private int id;

    private String nom;

    @ManyToMany(cascade = CascadeType.ALL)
    @JoinTable(name = "categories_has_motscles",
            joinColumns = @JoinColumn(name = "MotsCles_ID", referencedColumnName = "ID"),
            inverseJoinColumns = @JoinColumn(name = "Categories_ID", referencedColumnName = "ID")    )
    private Set<Categories> categories;

    @ManyToMany(cascade = CascadeType.ALL)
    @JoinTable(name = "images_has_motscles",
            joinColumns = @JoinColumn(name = "MotsCles_ID", referencedColumnName = "ID"),
            inverseJoinColumns = @JoinColumn(name = "Images_ID", referencedColumnName = "ID"))
    private Set<Images> images;

}
