package com.example.FlightTicketBooking.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDateTime;

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor

public class FlightEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)

    private Long flightId;
    private String name;
    private double fare;
    private LocalDateTime time;
}
