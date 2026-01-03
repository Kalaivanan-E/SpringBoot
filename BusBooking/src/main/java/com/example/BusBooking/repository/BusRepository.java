package com.example.BusBooking.repository;

import com.example.BusBooking.entity.BusEntity;
import org.springframework.data.jpa.repository.JpaRepository;

public interface BusRepository extends JpaRepository<BusEntity,Long> {

    BusEntity findBybusId(Long busId);
}
