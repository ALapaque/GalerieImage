package be.tftic.galerieimage.dal.entities;

import lombok.Data;

import javax.persistence.*;
import java.util.Objects;

@Entity
@Table(name = "images_has_motscles", schema = "galerieimage", catalog = "")
@Data
@IdClass(ImagesHasMotsclesEntityPK.class)
public class ImagesHasMotsclesEntity {

    @Id
    @Column(name = "images_id")
    private int imagesId;

    @Id
    @Column(name = "MotsCles_ID")
    private int motsClesId;

    @ManyToOne
    @JoinColumn(name = "Images_ID", referencedColumnName = "ID", nullable = false , insertable = false, updatable = false)
    private ImagesEntity imagesByImagesId;

    @ManyToOne
    @JoinColumn(name = "MotsCles_ID", referencedColumnName = "ID", nullable = false , insertable = false, updatable = false)
    private MotsclesEntity motsclesByMotsClesId;

}
