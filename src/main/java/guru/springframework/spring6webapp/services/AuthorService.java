package guru.springframework.spring6webapp.services;

// created by kp on 3/15/2023

import guru.springframework.spring6webapp.domain.Author;

public interface AuthorService {

    Iterable<Author> findAll();
}
