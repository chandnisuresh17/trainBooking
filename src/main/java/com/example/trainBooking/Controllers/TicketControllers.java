package com.example.trainBooking.Controllers;


import com.example.trainBooking.Models.TrainTicket;
import com.example.trainBooking.Services.TicketService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class TicketControllers {
    @Autowired
    private TicketService ticketService;

    @PostMapping("/bookTicket")
    public TrainTicket bookTicket(@RequestBody TrainTicket ticket){
        return ticketService.bookTicket(ticket);
    }

    @GetMapping("/getTickets")
    public List<TrainTicket> getTickets(){
        return ticketService.getTickets();
    }
}
