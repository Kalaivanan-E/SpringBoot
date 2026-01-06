package com.example.FlightTicketBooking.repository;

import com.example.FlightTicketBooking.entity.FlightEntity;
import org.springframework.data.jpa.repository.JpaRepository;

public interface FlightRepository extends JpaRepository<FlightEntity,Long> {

    FlightEntity findByflightId(Long flightId);
}
