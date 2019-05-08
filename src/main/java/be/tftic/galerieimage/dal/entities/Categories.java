package be.tftic.galerieimage.dal.entities;

import lombok.Data;

import javax.persistence.*;
import java.util.List;
import java.util.Set;

@Entity
@Table(name = "Categories")
@Data
public class Categories {

    @Id
    @GeneratedValue(strategy=GenerationType.IDENTITY)
    private int id;

    private String nom;

    //bi-directional many-to-many association to Motscle
    @ManyToMany(mappedBy="categories")
    private List<MotsCles> motscles;

    //bi-directional many-to-many association to Image
    @ManyToMany(mappedBy="categories")
    private List<Images> images;
}
