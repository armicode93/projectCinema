package be.com.cinema.project.controller;


import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController //combination of @controlleer @responsebody converta java object to  json or xml and will send back to the client
public class HelloWorldController {

    @GetMapping("/") //to make this methode as a rest api
    public String hello()
    {
        return "Hello guys";
    }
}
