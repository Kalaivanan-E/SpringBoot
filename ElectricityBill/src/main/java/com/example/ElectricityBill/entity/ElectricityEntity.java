package com.example.ElectricityBill.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor

public class ElectricityEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)

    private Long billId;
    private int units;
    private double amount;
}
