package com.example.BusBooking.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class BusDTO {

    private Long busId;
    private String name;
    private int age;
    private String gender;
    private Long phoneNo;
}
