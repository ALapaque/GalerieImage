package be.tftic.galerieimage.dal.entities.dto;

import com.fasterxml.jackson.annotation.JsonIdentityInfo;
import com.fasterxml.jackson.annotation.ObjectIdGenerators;
import lombok.Data;

import javax.persistence.*;

@Entity
@Table(name = "images")
@Data
public class ImagesDTO {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    private byte delete;

    private String description;

    private int like;

    private String nom;

    private String src;
}
