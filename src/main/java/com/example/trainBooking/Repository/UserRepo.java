package com.example.trainBooking.Repository;

import com.example.trainBooking.Models.User;
import org.springframework.data.repository.CrudRepository;

public interface UserRepo extends CrudRepository<User, Integer> {
}
