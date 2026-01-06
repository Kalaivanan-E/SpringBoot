package com.example.HotelBooking.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class HotelDTO {
    private Long id;
    private String roomType;
    private int days;
    private double amount;
}
