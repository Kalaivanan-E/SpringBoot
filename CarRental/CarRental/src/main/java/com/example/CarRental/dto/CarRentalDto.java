package com.example.CarRental.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class CarRentalDto {

    private Long id;
    private String brand;
    private String model;
    private double dailyRate;
    private boolean available;
}
