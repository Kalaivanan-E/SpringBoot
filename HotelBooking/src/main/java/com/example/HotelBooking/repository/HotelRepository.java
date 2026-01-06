package com.example.HotelBooking.repository;

import com.example.HotelBooking.entity.HotelEntity;
import org.springframework.data.jpa.repository.JpaRepository;

public interface HotelRepository extends JpaRepository<HotelEntity,Long> {

    HotelEntity findByid(Long id);
}
