package com.example.trainBooking.Repository;

import com.example.trainBooking.Models.TrainTicket;
import org.springframework.data.repository.CrudRepository;

public interface TicketRepo extends CrudRepository<TrainTicket, Integer> {
}
