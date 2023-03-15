package guru.springframework.spring6webapp.services;

// created by kp on 3/14/2023

import guru.springframework.spring6webapp.domain.Book;

public interface BookService {

    Iterable<Book> findAll();
}
