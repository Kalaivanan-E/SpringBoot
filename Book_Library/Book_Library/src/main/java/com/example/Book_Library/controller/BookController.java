package com.example.Book_Library.controller;


import com.example.Book_Library.dto.BookDto;
import com.example.Book_Library.entity.Book;
import com.example.Book_Library.service.impl.BookServiceimpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController // it handles the controller classs, it return data in json and xml format
@RequestMapping ("/api/book")
public class BookController {
    @Autowired
    private BookServiceimpl service;

    @PostMapping ("/savebook") // to create a data

    public ResponseEntity<BookDto> createBook(@RequestBody BookDto bookDto){
        BookDto B = service.createBook(bookDto);
        return new ResponseEntity<>(B, HttpStatus.CREATED);
    }
    @GetMapping("/{id}")

    public ResponseEntity<Book> getBook(@PathVariable Long id){
        Book B = service.getBook(id);
        return new ResponseEntity<>(B,HttpStatus.OK);
    }
}
