package webapplication.music.entities;

import jakarta.persistence.*;
import lombok.Data;

@Data
@Entity
@Table(name = "salle")
public class Salle {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id", nullable = false)
    private Long id;

    private String nom;
    private String ville;

    @ManyToOne
    @JoinColumn(name = "proprietaire_id", unique = true)
    private Proprietaire proprietaire;




}
