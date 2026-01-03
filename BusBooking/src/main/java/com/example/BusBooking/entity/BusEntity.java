package com.example.BusBooking.entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Table(name = "BusBookingdetails")
@Data
@AllArgsConstructor
@NoArgsConstructor
public class BusEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long busId;
    private String name;
    private int age;
    private String gender;
    private Long phoneNo;
}
