package guru.springframework.spring6webapp.services;

// created by kp on 3/15/2023

import guru.springframework.spring6webapp.domain.Author;
import guru.springframework.spring6webapp.repositories.AuthorRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class AuthorServiceImpl implements AuthorService {

    private final AuthorRepository authorRepository;

    @Override
    public Iterable<Author> findAll() {
        return authorRepository.findAll();
    }
}
