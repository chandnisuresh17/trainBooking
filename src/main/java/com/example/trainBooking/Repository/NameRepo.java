package com.example.trainBooking.Repository;

import com.example.trainBooking.Models.TrainName;
import org.springframework.data.repository.CrudRepository;

public interface NameRepo extends CrudRepository<TrainName, Integer> {
}
