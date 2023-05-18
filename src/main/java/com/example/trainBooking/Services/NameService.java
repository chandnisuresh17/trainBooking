package com.example.trainBooking.Services;


import com.example.trainBooking.Models.TrainName;
import com.example.trainBooking.Repository.NameRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.Optional;

@Component
public class NameService {
    @Autowired
    private NameRepo trainRepo;

    public TrainName addTrain(TrainName train) {
        trainRepo.save(train);
        return train;
    }

    public Optional<TrainName> getTrainById(int id) {
        return trainRepo.findById(id);

    }
}

