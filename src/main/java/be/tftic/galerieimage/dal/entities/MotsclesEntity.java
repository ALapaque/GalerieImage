package be.tftic.galerieimage.dal.entities;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import lombok.Data;

import javax.persistence.*;
import java.util.Collection;
import java.util.Objects;

@Entity
@Table(name = "motscles", schema = "galerieimage", catalog = "")
@Data
public class MotsclesEntity {

    @Id
    @Column(name = "ID")
    private int id;

    @Basic
    @Column(name = "nom")
    private String nom;

    @OneToMany(mappedBy = "motsclesByMotsClesId")
    @JsonIgnoreProperties("motsclesByMotsClesId")
    private Collection<CategoriesHasMotsclesEntity> categoriesHasMotsclesById;

    @OneToMany(mappedBy = "motsclesByMotsClesId")
    @JsonIgnoreProperties("motsClesByMotsClesId")
    private Collection<ImagesHasMotsclesEntity> imagesHasMotsclesById;

}
