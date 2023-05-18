package com.example.trainBooking.Controllers;


import com.example.trainBooking.Models.User;
import com.example.trainBooking.Services.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.Optional;

@RestController
public class UserControllers {
    @Autowired
    private UserService userService;

    @PostMapping("/addUser")
    public User addUser(@RequestBody User user){
        return userService.addUser(user);
    }
    @GetMapping("/getUser")
    public Optional<User> getUser(@RequestBody int id){
        return userService.getUser(id);
    }
}
