package webapplication.music.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import webapplication.music.entities.Salle;

import java.util.List;

public interface SalleRepository extends JpaRepository<Salle, Long> {

}
