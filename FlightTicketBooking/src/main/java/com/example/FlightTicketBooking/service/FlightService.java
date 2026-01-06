package com.example.FlightTicketBooking.service;

import com.example.FlightTicketBooking.dto.FlightDTO;
import com.example.FlightTicketBooking.entity.FlightEntity;

public interface FlightService {
    FlightDTO createFlight(FlightDTO flightdto);
    FlightEntity getFlight(Long flightId);
    FlightDTO updateFlight(Long flightId,FlightDTO flightdto);
    void deleteFlight(Long flightId);
}
