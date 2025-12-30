package com.example.CarRental.service;

import com.example.CarRental.CarRentalApplication;
import com.example.CarRental.dto.CarRentalDto;
import com.example.CarRental.entity.CarRental;

public interface CarRentalService {

    CarRentalDto createCar(CarRentalDto carRentaldto);
    CarRental getCar(Long id);
    CarRentalDto updateCar(Long id, CarRentalDto carRentaldto);
    void deleteCar(Long id);
}
