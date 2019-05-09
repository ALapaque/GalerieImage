package be.tftic.galerieimage.dal.entities;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import lombok.Data;

import javax.persistence.*;
import java.util.Collection;
import java.util.Objects;

@Entity
@Table(name = "categories", schema = "galerieimage", catalog = "")
@Data
public class CategoriesEntity {

    @Id
    @Column(name = "ID")
    private int id;

    @Basic
    @Column(name = "nom")
    private String nom;

    @OneToMany(mappedBy = "categoriesByCategoriesId")
    @JsonIgnoreProperties("categoriesByCategoriesId")
    private Collection<CategoriesHasMotsclesEntity> categoriesHasMotsclesById;

    @OneToMany(mappedBy = "categoriesByCategoriesId")
    @JsonIgnoreProperties("categoriesByCategoriesId")
    private Collection<ImagesHasCategoriesEntity> imagesHasCategoriesById;
}
