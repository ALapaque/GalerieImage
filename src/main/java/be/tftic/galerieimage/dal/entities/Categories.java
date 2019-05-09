package be.tftic.galerieimage.dal.entities;

import com.fasterxml.jackson.annotation.JsonBackReference;
import lombok.Data;

import javax.persistence.*;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

@Entity
@Table(name = "categories")
@Data
public class Categories {

    @Id
    @GeneratedValue(strategy=GenerationType.IDENTITY)
    private int id;

    private String nom;

    @ManyToMany(mappedBy = "categories")
    private Set<MotsCles> motscles = new HashSet<>();

    @ManyToMany(mappedBy = "categories")
    private Set<Images> images = new HashSet<>();


}
