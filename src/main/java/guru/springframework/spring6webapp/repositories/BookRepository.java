package guru.springframework.spring6webapp.repositories;

// created by kp on 3/12/2023

import guru.springframework.spring6webapp.domain.Book;
import org.springframework.data.jpa.repository.JpaRepository;

public interface BookRepository extends JpaRepository<Book,Long> {
}
