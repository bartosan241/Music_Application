package webapplication.music.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import webapplication.music.entities.Proprietaire;
import webapplication.music.entities.Salle;

import java.util.List;

public interface ProprietaireRepository extends JpaRepository<Proprietaire, Long> {

}

