package com.example.Book_Library.dto;


import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor

public class BookDto {

    private Long id;
    private String title;
    private String author;
    private  double price;
}
