package com.example.HotelBooking.service;

import com.example.HotelBooking.dto.HotelDTO;
import com.example.HotelBooking.entity.HotelEntity;

public interface HotelService {

    HotelDTO createhotel(HotelDTO hoteldto);
    HotelEntity gethotel(Long id);
    HotelDTO updatehotel(Long id, HotelDTO hoteldto);
    void deletehotel(Long id);
}
