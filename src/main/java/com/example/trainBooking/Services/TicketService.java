package com.example.trainBooking.Services;



import com.example.trainBooking.Models.TrainTicket;
import com.example.trainBooking.Repository.TicketRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import java.util.*;

@Component
public class TicketService {
    @Autowired
    private TicketRepo ticketRepo;

    public TrainTicket bookTicket(TrainTicket ticket){
        ticketRepo.save(ticket);
        return ticket;
    }

    public List<TrainTicket> getTickets(){
        return (List<TrainTicket>) ticketRepo.findAll();
    }

}
