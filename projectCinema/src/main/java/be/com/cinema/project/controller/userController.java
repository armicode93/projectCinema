package be.com.cinema.project.controller;

import be.com.cinema.project.entities.User;
import be.com.cinema.project.service.UserService;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
//combination of @controlleer @responsebody converte java object to  json or xml and will send back to the client
public class userController {

    //injection dependency
    private UserService userService;


    //come avevam odetto prima we are going to use  constructor based dependency injection
    public userController(UserService userService) {
        super();
        this.userService = userService;
    }

    // buid get all employee REST API

    @GetMapping("/user/all")
    public List<User> getAllUsers()
    {
        return userService.getAllUser();
    }
}
