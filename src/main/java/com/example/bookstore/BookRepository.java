package com.example.bookstore;


import org.springframework.data.repository.CrudRepository;

import java.util.List;

public interface BookRepository extends CrudRepository<Book, String> {

    List<Book> findBookByAuthor(String author);

    List<Book> findBookByTitle(String author);
}
