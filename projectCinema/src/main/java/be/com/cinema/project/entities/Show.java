package be.com.cinema.project.entities;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

import javax.persistence.*;

@Entity
@Table(name="shows")
@Getter
@Setter
@ToString
public class Show {

    @Id
    @GeneratedValue(strategy= GenerationType.IDENTITY)
    private Long id;

    private String login;

    private String password;

    private String firstname;

    private String lastname;

    private String email;



    private String langue;


}
