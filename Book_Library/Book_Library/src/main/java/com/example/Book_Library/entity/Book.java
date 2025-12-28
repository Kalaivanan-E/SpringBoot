package com.example.Book_Library.entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity // for creating table in database
@Table(name = "BookLibrary")
@Data  // to generate getter&setter, equal&hashcode, toString
@AllArgsConstructor // to generate parameterized constructor
@NoArgsConstructor // to generate default constructor

public class Book {
    @Id  // primary key
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String title;
    private String author;
    private  double price;
}
