package be.tftic.galerieimage.dal.entities;

import lombok.Data;

import javax.persistence.*;
import java.util.List;

@Entity
@Table(name = "MotsCles")
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
