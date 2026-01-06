package com.example.FlightTicketBooking.dto;


import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDateTime;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class FlightDTO {
    private Long flightId;
    private String name;
    private double fare;
    private LocalDateTime time;
}
