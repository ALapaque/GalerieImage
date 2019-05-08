package be.tftic.galerieimage.dal.entities;

import com.fasterxml.jackson.annotation.JsonIdentityInfo;
import com.fasterxml.jackson.annotation.JsonManagedReference;
import com.fasterxml.jackson.annotation.ObjectIdGenerators;
import lombok.Data;

import javax.persistence.*;
import java.util.List;

@Entity
@Table(name = "categories")
@Data
public class Categories {

    @Id
    @GeneratedValue(strategy=GenerationType.IDENTITY)
    private int id;

    private String nom;


    //bi-directional many-to-many association to Motscle
    @ManyToMany(mappedBy="categories", fetch = FetchType.LAZY)
    private List<MotsCles> motscles;

    //bi-directional many-to-many association to Image
    @ManyToMany(mappedBy="categories", fetch = FetchType.LAZY)
    private List<Images> images;
}
