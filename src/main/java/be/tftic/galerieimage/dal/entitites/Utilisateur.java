package be.tftic.galerieimage.dal.entitites;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import lombok.Data;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;

@Entity
@Table(name="utilisateur")
@NamedQuery(name="Utilisateur.findAll", query="SELECT i FROM Utilisateur i")
@Data
public class Utilisateur {

    @Id
    @GeneratedValue(strategy=GenerationType.IDENTITY)
    @Column(unique=true, nullable=false, name = "id_utilisateur")
    private int id_utilisateur;

    @Column(nullable=false)
    private boolean isDeleted;

    @Column(nullable=false, length=250)
    private String nom;

    @Column(nullable=false, length=250)
    private String prenom;

    @Column(nullable=false, length=250)
    private String email;

    @Column(nullable=false, length=250)
    private String username;

    @Column(nullable=false, length=250)
    private String password;

    @OneToMany(mappedBy = "utilisateur", cascade = CascadeType.REMOVE, orphanRemoval = true)
    private List<Image> utilisateur = new ArrayList<Image>();

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "id_role")
    @JsonIgnoreProperties("role")
    private Role role;
}
