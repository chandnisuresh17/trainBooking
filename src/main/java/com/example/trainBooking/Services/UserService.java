package com.example.trainBooking.Services;


import com.example.trainBooking.Models.User;
import com.example.trainBooking.Repository.UserRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import java.util.Optional;
@Component
public class UserService {
    @Autowired
    private UserRepo userRepo;
    public User addUser(User user){
        userRepo.save(user);
        return user;
    }
    public Optional<User> getUser(int id){
        return userRepo.findById(id);
    }
}