package com.example.Book_Library.repository;

import com.example.Book_Library.entity.Book;
import org.springframework.data.jpa.repository.JpaRepository;


// repository is interface to extends jparepository to perform crud operation
public interface BookRepository extends JpaRepository<Book,Long> {

    Book findByid(Long id);
}
