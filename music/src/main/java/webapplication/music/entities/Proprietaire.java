package webapplication.music.entities;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.LinkedHashSet;
import java.util.Set;

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
@Table(name = "proprietaire")
public class Proprietaire {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String nom_prop;
    private String prenom_prop;
    private String tel_prop;
    private String mail_prop;

    @OneToMany(mappedBy = "proprietaire")
    private Set<Salle> salles = new LinkedHashSet<>();

}
