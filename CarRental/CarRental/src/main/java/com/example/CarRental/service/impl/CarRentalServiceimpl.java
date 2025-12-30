package com.example.CarRental.service.impl;

import com.example.CarRental.dto.CarRentalDto;
import com.example.CarRental.entity.CarRental;
import com.example.CarRental.repository.CarRentalRepository;
import com.example.CarRental.service.CarRentalService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class CarRentalServiceimpl implements CarRentalService {

    @Autowired
    private CarRentalRepository repo;

    public CarRentalDto createCar(CarRentalDto carRentaldto){
        CarRental c = new CarRental(
                carRentaldto.getId(),
                carRentaldto.getBrand(),
                carRentaldto.getModel(),
                carRentaldto.getDailyRate(),
                carRentaldto.isAvailable()
        );
        CarRental savedCar = repo.save(c);
        CarRentalDto savecar = new CarRentalDto(
                savedCar.getId(),
                savedCar.getBrand(),
                savedCar.getModel(),
                savedCar.getDailyRate(),
                savedCar.isAvailable()
        );
        return savecar;
    }
    public CarRental getCar(Long id){
        return repo.findByid(id);
    }
    public CarRentalDto updateCar(Long id, CarRentalDto carRentaldto){
        CarRental carRental = repo.findByid(id);

        carRental.setBrand(carRentaldto.getBrand());
        carRental.setDailyRate(carRental.getDailyRate());
        carRental.setModel(carRental.getModel());

        CarRental updatedcar = repo.save(carRental);
        return new CarRentalDto(
                updatedcar.getId(),
                updatedcar.getBrand(),
                updatedcar.getModel(),
                updatedcar.getDailyRate(),
                updatedcar.isAvailable()
        );
    }

}
