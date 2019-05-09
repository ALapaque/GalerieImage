package be.tftic.galerieimage.dal.entities;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import lombok.Data;

import javax.persistence.*;
import java.util.Collection;
import java.util.Objects;

@Entity
@Table(name = "images", schema = "galerieimage", catalog = "")
@Data
public class ImagesEntity {

    @Id
    @Column(name = "ID")
    private int id;

    @Basic
    @Column(name = "nom")
    private String nom;

    @Basic
    @Column(name = "src")
    private String src;

    @Basic
    @Column(name = "description")
    private String description;

    @Basic
    @Column(name = "like")
    private int like;

    @Basic
    @Column(name = "delete")
    private byte delete;

    @Basic
    @Column(name = "Utilisateurs_ID")
    private int utilisateursId;

    @ManyToOne
    @JoinColumn(name = "Utilisateurs_ID", referencedColumnName = "ID", nullable = false, insertable = false, updatable = false)
    private UtilisateursEntity utilisateursByUtilisateursId;

    @OneToMany(mappedBy = "imagesByImagesId")
    @JsonIgnoreProperties("imagesbyImagesId")
    private Collection<ImagesHasCategoriesEntity> imagesHasCategoriesById;

    @OneToMany(mappedBy = "imagesByImagesId")
    @JsonIgnoreProperties("imagesByImagesId")
    private Collection<ImagesHasMotsclesEntity> imagesHasMotsclesById;

}
