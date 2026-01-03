package com.example.BusBooking.service;

import com.example.BusBooking.dto.BusDTO;
import com.example.BusBooking.entity.BusEntity;

public interface BusService {

    BusDTO createBus(BusDTO busdto);
    BusEntity getBus(Long busId);
    BusDTO updateBus(Long busId, BusDTO busdto);
    void deleteBus(Long busId);
}
