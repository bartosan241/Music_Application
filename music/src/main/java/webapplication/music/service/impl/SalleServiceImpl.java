package webapplication.music.service.impl;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import webapplication.music.entities.Salle;
import webapplication.music.repositories.SalleRepository;
import webapplication.music.service.SalleService;

import java.util.List;

@Service
public class SalleServiceImpl implements SalleService {

    private static final Logger logger = LoggerFactory.getLogger(SalleServiceImpl.class);

    @Autowired
    private SalleRepository salleRepository;

    @Override
    public List<Salle> getSalles() {
        logger.info("Fetching all salles.");
        return salleRepository.findAll();
    }

    @Override
    public Salle addSalle(Salle salle) {
        logger.info("Adding salle: {}", salle);
        return salleRepository.save(salle);
    }

    @Override
    public Salle updateSalle(Salle salle) {
        logger.info("Updating salle: {}", salle);
        return salleRepository.save(salle);
    }

    @Override
    public Salle deleteSalle(Long id) {
        Salle salle = new Salle();
        salle.setId(id);
        this.salleRepository.delete(salle);
        return salle;
    }

    @Override
    public Salle getSalleById(Long id) {
        Salle salle = salleRepository.findById(id).orElse(null);
        // Log pour vérifier si le propriétaire est récupéré
        logger.info("Propriétaire de la salle : {}", salle.getProprietaire());
        return salle;
    }

}
