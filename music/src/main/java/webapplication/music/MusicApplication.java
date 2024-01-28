package webapplication.music;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.web.bind.annotation.*;
import webapplication.music.entities.Salle;

import java.util.ArrayList;
import java.util.List;

@SpringBootApplication
@ComponentScan(basePackages = "webapplication.music")
public class MusicApplication {

    private static List<Salle> salles = new ArrayList<>();

    public static void main(String[] args) {
        SpringApplication.run(MusicApplication.class, args);
    }
}
