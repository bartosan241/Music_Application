package webapplication.music.service;

import webapplication.music.entities.Salle;

import java.util.List;

public interface SalleService {
    List<Salle> getSalles();
    Salle addSalle(Salle salle);
    Salle updateSalle(Salle salle);
    Salle deleteSalle(Long id);
    Salle getSalleById(Long id); // Ajout de la méthode getSalleById
}
