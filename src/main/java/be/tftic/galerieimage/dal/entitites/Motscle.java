package be.tftic.galerieimage.dal.entitites;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import lombok.Data;

import javax.persistence.*;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

@Entity
@Table(name="motscle")
@NamedQuery(name="motscle.findAll", query="SELECT c FROM Motscle c")
@Data
public class Motscle implements Serializable {
    private static final long serialVersionUID = 1L;

    @Id
    @GeneratedValue(strategy=GenerationType.IDENTITY)
    @Column(unique=true, nullable=false, name = "id_motscle")
    private long id_motscle;

    @Column(nullable=false, length=250)
    private String nom;

    @OneToMany(mappedBy = "motscle", cascade = CascadeType.REMOVE, orphanRemoval = true)
    @JsonIgnoreProperties("motscle")
    private List<CategoryHasMotscle> category = new ArrayList<CategoryHasMotscle>();

    @OneToMany(mappedBy = "motscle", cascade = CascadeType.REMOVE, orphanRemoval = true)
    @JsonIgnoreProperties("motscle")
    private List<ImageHasMotscle> image = new ArrayList<ImageHasMotscle>();
}
