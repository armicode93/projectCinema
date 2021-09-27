package be.com.cinema.project.service;

import be.com.cinema.project.entities.User;

import java.util.List;

//interface
public interface UserService {
    User saveUser (User user);
    List<User> getAllUser();
}
