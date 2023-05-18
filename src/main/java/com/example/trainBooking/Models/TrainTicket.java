package com.example.trainBooking.Models;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@Entity
@NoArgsConstructor
@AllArgsConstructor
@Data
public class TrainTicket {
    @Id
    @GeneratedValue
    private int ticket_id;

    @OneToOne(fetch = FetchType.EAGER)
    private User user;

    @OneToOne(fetch = FetchType.EAGER)
    private TrainName train;
}
