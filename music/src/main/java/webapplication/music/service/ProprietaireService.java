package webapplication.music.service;

import webapplication.music.entities.Proprietaire;

import java.util.List;
import java.util.Set;

public interface ProprietaireService {
    List<Proprietaire> getProprietaires();
    Proprietaire addProprietaire (Proprietaire proprietaire);
    Proprietaire updateProprietaire (Proprietaire proprietaire);
    void deleteProprietaire (long id);
    Proprietaire getProprietaireById (Long id);

}
