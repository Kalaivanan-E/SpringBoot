package com.example.CarRental.repository;

import com.example.CarRental.entity.CarRental;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CarRentalRepository extends JpaRepository<CarRental ,Long> {


}
