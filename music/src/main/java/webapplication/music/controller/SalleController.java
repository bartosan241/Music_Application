package webapplication.music.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import webapplication.music.entities.Proprietaire;
import webapplication.music.entities.Salle;
import webapplication.music.service.SalleService;



@RestController
@RequestMapping("/api/salle")
public class SalleController {

    @Autowired
    private SalleService salleService;

    @GetMapping("/")
    public ResponseEntity<?> getAllSalles() {
        return ResponseEntity.ok(this.salleService.getSalles());
    }

    @GetMapping("/{id}")
    public ResponseEntity<Salle> getSalle (@PathVariable("id") Long id) {
        return  ResponseEntity.ok(salleService.getSalleById(id));
    }

    @PostMapping("/add")
    public ResponseEntity<Salle> addSalle(@RequestBody Salle salle) {
        System.out.println("Adding salle: " + salle.toString());
        return ResponseEntity.ok(salleService.addSalle(salle));
    }

    @PutMapping("/update")
    public ResponseEntity<Salle> updateSalle(@RequestBody Salle salle) {
        return  ResponseEntity.ok(salleService.updateSalle(salle));
    }

    @DeleteMapping("/delete/{id}")
    public void deleteSalle(@PathVariable("id") Long id) {
        salleService.deleteSalle(id);
    }


}
