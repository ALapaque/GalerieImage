package be.tftic.galerieimage.dal.entities;

import com.fasterxml.jackson.annotation.JsonBackReference;
import com.fasterxml.jackson.annotation.JsonIdentityInfo;
import com.fasterxml.jackson.annotation.JsonManagedReference;
import com.fasterxml.jackson.annotation.ObjectIdGenerators;
import lombok.Data;

import javax.persistence.*;
import java.util.List;

@Entity
@Table(name = "motscles")
@Data
public class MotsCles {

    @Id
    @GeneratedValue(strategy=GenerationType.IDENTITY)
    private int id;

    private String nom;

    //bi-directional many-to-many association to Category
    @ManyToMany
    @JoinTable(
            name="categories_has_motscles"
            , joinColumns={
            @JoinColumn(name="MotsCles_ID")
    }
            , inverseJoinColumns={
            @JoinColumn(name="Categories_ID")
    }
    )
    private List<Categories> categories;

    //bi-directional many-to-many association to Image
    @ManyToMany
    @JoinTable(
            name="images_has_motscles"
            , joinColumns={
            @JoinColumn(name="MotsCles_ID")
    }
            , inverseJoinColumns={
            @JoinColumn(name="Images_ID")
    }
    )
    private List<Images> images;
}
