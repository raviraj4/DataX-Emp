package com.example.datax.controller;

import org.springframework.web.bind.annotation.RestController;
// import com.example.datax.repository.UserRepository;
import com.example.datax.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
// import org.springframework.web.bind.annotation.RequestParam;
import java.util.List;
import com.example.datax.model.User;
import com.example.datax.repository.UserRepository;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;


@RestController
@RequestMapping("/users")
public class UserController {

    @Autowired
    private UserService userService;

    @Autowired
    private UserRepository userRepository;

    @PostMapping("/generate")
    public String addUser(@RequestParam String name,@RequestParam String city, @RequestParam String contact ) {
        User user = new User();
        user.setName(name);
        user.setCity(city);
        user.setContactNumber(contact);
        userRepository.save(user); // Save the user to the database
        return "OK";
    }

@DeleteMapping("/delete") // Use DeleteMapping for deletion
    public String delUser(@RequestParam Long id) { // Change int to Long if your ID is Long
        userRepository.deleteById(id); // Use the id parameter passed in the request
        return "DELETED";
    }
    @GetMapping("/all")
    public List<User> getAllUsers() {
            return userService.getAll();
    }
}



