package be.com.cinema.project.serviceImpl;

import be.com.cinema.project.entities.User;
import be.com.cinema.project.repository.UserRepository;
import be.com.cinema.project.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service //because it's a service class
//class that implement userService interface
public class UserServiceImpl implements UserService {

    private UserRepository userRepository;
    //i m going to implement the methode from the interface class

    /*we need to inject the dependency, there are 2 types of injection: Setter based dependency injection
    constructor based dependency injection iniezione di dipendenza basata sul costruttore we are going to use this*/
    //constructor based dependency injection we use when we have un parametre obligatoire

    @Autowired
    public UserServiceImpl(UserRepository userRepository) {
        super();
        this.userRepository = userRepository;
    }

    //i m going to implement the methode from the interface class
    @Override
    public User saveUser(User user) {
        return userRepository.save(user);
    }

    @Override
    public List<User> getAllUser() {
        return userRepository.findAll();
    }


}
