package com.example.Book_Library.service.impl;

import com.example.Book_Library.dto.BookDto;
import com.example.Book_Library.entity.Book;
import com.example.Book_Library.repository.BookRepository;
import com.example.Book_Library.service.BookService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service // to write business logic
public class BookServiceimpl implements BookService {

    @Autowired // inject one class object into another class object
    private BookRepository repo;

    public BookDto createBook(BookDto bookdto){
        Book B = new Book(
                bookdto.getId(),
                bookdto.getTitle(),
                bookdto.getAuthor(),
                bookdto.getPrice()
        );
        Book savedBook = repo.save(B);
        BookDto savebook = new BookDto(
                savedBook.getId(),
                savedBook.getTitle(),
                savedBook.getAuthor(),
                savedBook.getPrice()
        );
        return savebook;
    }
    public Book getBook(Long id){
        return repo.findByid(id);
    }
    public BookDto updateBook(Long id, BookDto bookDto){
        Book updatebook = repo.findByid(id);

        updatebook.setTitle(bookDto.getTitle());
        updatebook.setAuthor(bookDto.getAuthor());
        updatebook.setPrice(bookDto.getPrice());

        Book updatedbook = repo.save(updatebook);

        return new BookDto(
                updatedbook.getId(),
                updatebook.getTitle(),
                updatedbook.getAuthor(),
                updatedbook.getPrice()
        );
    }
}
