package webapplication.music.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import webapplication.music.entities.Proprietaire;
import webapplication.music.entities.Salle;
import webapplication.music.service.ProprietaireService;
import webapplication.music.service.SalleService;

import java.util.List;

@RestController
@RequestMapping("/api/proprio")
public class ProprietaireController {

    @Autowired
    private ProprietaireService proprietaireService;

    @GetMapping("/")
    public ResponseEntity<?> getAllProprietaire() {
        return ResponseEntity.ok(this.proprietaireService.getProprietaires());
    }

    @GetMapping("/{id}")
    public ResponseEntity<Proprietaire> getProprietaire (@PathVariable("id") Long id) {
        return  ResponseEntity.ok(proprietaireService.getProprietaireById(id));
    }

    @PostMapping("/add")
    public ResponseEntity<Proprietaire> addProprietaire(@RequestBody Proprietaire proprietaire) {
        return ResponseEntity.ok(proprietaireService.addProprietaire(proprietaire));
    }

    @PutMapping("/update")
    public ResponseEntity<Proprietaire> updateProprietaire(@RequestBody Proprietaire proprietaire) {
        return  ResponseEntity.ok(proprietaireService.updateProprietaire(proprietaire));
    }

    @DeleteMapping("/delete/{id}")
    public void deleteProprietaire(@PathVariable("id") Long id) {
        proprietaireService.deleteProprietaire(id);
    }


}