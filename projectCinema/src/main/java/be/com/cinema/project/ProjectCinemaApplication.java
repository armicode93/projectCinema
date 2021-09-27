package be.com.cinema.project;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication // contien configuration annotation, pour  definire une class comme spring  configuration class
public class ProjectCinemaApplication {

    public static void main(String[] args) {
        SpringApplication.run(ProjectCinemaApplication.class, args);
    }

}
