package com.example.ElectricityBill.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class ElectricityDTO {

    private Long billId;
    private int units;
    private double amount;
}
