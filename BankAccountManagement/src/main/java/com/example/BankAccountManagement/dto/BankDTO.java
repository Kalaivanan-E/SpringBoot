package com.example.BankAccountManagement.dto;


import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class BankDTO {

    private Long accountId;
    private String name;
    private String accountType;
    private double balance;
}
