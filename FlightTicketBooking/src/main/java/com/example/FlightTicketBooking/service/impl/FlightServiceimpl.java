package com.example.FlightTicketBooking.service.impl;

import com.example.FlightTicketBooking.dto.FlightDTO;
import com.example.FlightTicketBooking.entity.FlightEntity;
import com.example.FlightTicketBooking.repository.FlightRepository;
import com.example.FlightTicketBooking.service.FlightService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class FlightServiceimpl implements FlightService {

    @Autowired
    private FlightRepository repo;

    public FlightDTO createFlight(FlightDTO flightdto){
        FlightEntity F1 = new FlightEntity(
                flightdto.getFlightId(),
                flightdto.getName(),
                flightdto.getFare(),
                flightdto.getTime()
        );
        FlightEntity savedF1 = repo.save(F1);

        return new FlightDTO(
                savedF1.getFlightId(),
                savedF1.getName(),
                savedF1.getFare(),
                savedF1.getTime()
        );

    }
    public FlightEntity getFlight(Long flightId){
        return repo.findByflightId(flightId);
    }

    public FlightDTO updateFlight(Long flightId, FlightDTO flightdto){
        FlightEntity f3 = repo.findByflightId(flightId);
        f3.setName(flightdto.getName());
        f3.setFare(flightdto.getFare());
        f3.setTime(flightdto.getTime());
        FlightEntity savedf3 = repo.save(f3);
        return new FlightDTO(
                savedf3.getFlightId(),
                savedf3.getName(),
                savedf3.getFare(),
                savedf3.getTime()
        );
    }

    public void deleteFlight(Long flightId){
        FlightEntity f4 = repo.findByflightId(flightId);
        repo.delete(f4);
    }
}
