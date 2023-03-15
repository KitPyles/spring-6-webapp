package guru.springframework.spring6webapp.services;

// created by kp on 3/14/2023

import guru.springframework.spring6webapp.domain.Book;
import guru.springframework.spring6webapp.repositories.BookRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class BookServiceImpl implements BookService {

    private final BookRepository bookRepository;

    @Override
    public Iterable<Book> findAll() {
        return bookRepository.findAll();
    }
}
