package com.example.Employee_Details.entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity  // for creating table in mysql we use
@Table(name = "Employee_details")  // table name

@Data // to generator getter&setter, equal & hashcode, toString()
@AllArgsConstructor // to generator parameterized constructor
@NoArgsConstructor // to generator default constructor

public class Employee {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String Employee_Name;
    private double Salary;
}
