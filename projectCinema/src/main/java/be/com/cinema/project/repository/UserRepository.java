package be.com.cinema.project.repository;

import be.com.cinema.project.entities.User;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

//@Repository no repository annotation because JpaRepository class provide this annotation
public interface UserRepository extends JpaRepository<User, Long> {
    //Jpa repository require 2 parametres 1 type of the entity , 2 primary key

}
