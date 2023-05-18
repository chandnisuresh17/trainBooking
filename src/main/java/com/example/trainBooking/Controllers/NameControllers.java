package com.example.trainBooking.Controllers;


import com.example.trainBooking.Models.TrainName;
import com.example.trainBooking.Services.NameService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.Optional;

@RestController
public class NameControllers {
    @Autowired
    private NameService trainService;

    @PostMapping("/addTrain")
    public TrainName addTrain(@RequestBody TrainName train){
        return trainService.addTrain(train);
    }
    @GetMapping("/getTrainById")
    public Optional<TrainName> getTrainById(@RequestBody int id){
        return trainService.getTrainById(id);
    }

}
