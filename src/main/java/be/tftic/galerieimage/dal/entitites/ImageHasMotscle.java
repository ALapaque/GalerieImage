package be.tftic.galerieimage.dal.entitites;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import lombok.Data;

import javax.persistence.*;
import java.io.Serializable;

@Entity
@IdClass(ImageHasMotscle.class)
@Table(name = "image_has_motscle")
@Data
public class ImageHasMotscle implements Serializable {
    private static final long serialVersionUID = 1L;

    @Id
    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "id_motscle")
    @JsonIgnoreProperties(ignoreUnknown = true,
            value = {"image", "category"})
    private Motscle motscle;

    @Id
    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "id_image")
    @JsonIgnoreProperties("motscle")
    private Image image;

}
