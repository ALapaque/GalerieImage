package be.tftic.galerieimage.dal.entities;

import javax.persistence.Column;
import javax.persistence.Id;
import java.io.Serializable;
import java.util.Objects;

public class ImagesHasMotsclesEntityPK implements Serializable {

    @Column(name = "Images_ID")
    @Id
    private int imagesId;

    @Column(name = "MotsCles_ID")
    @Id
    private int motsClesId;



}
