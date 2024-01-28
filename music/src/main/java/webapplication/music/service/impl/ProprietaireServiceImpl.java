package webapplication.music.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import webapplication.music.entities.Proprietaire;
import webapplication.music.entities.Salle;
import webapplication.music.repositories.ProprietaireRepository;
import webapplication.music.service.ProprietaireService;
import webapplication.music.service.SalleService;

import java.util.List;

@Service
public class ProprietaireServiceImpl implements ProprietaireService {

    @Autowired
    private ProprietaireRepository proprietaireRepository;

    @Override
    public List<Proprietaire> getProprietaires() {
        return this.proprietaireRepository.findAll();
    }

    @Override
    public Proprietaire addProprietaire(Proprietaire proprietaire) {
        return this.proprietaireRepository.save(proprietaire);
    }

    @Override
    public Proprietaire updateProprietaire(Proprietaire proprietaire) {
        return this.proprietaireRepository.save(proprietaire);
    }

    @Override
    public void deleteProprietaire(long id) {
        Proprietaire proprietaire = new Proprietaire();
        proprietaire.setId(id);
        this.proprietaireRepository.delete(proprietaire);

    }

    @Override
    public Proprietaire getProprietaireById(Long id) {
        Proprietaire proprietaire = proprietaireRepository.findById(id).orElse(null);
        // Initialiser explicitement la relation
        proprietaire.getSalles().size();
        return proprietaire;
    }

}
