package com.example.Book_Library.service;

import com.example.Book_Library.dto.BookDto;
import com.example.Book_Library.entity.Book;

public interface BookService {
    BookDto createBook(BookDto bookdto);
    Book getBook(Long id);
}
