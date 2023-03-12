package guru.springframework.spring6webapp.domain.repositories;

// created by kp on 3/12/2023

import guru.springframework.spring6webapp.domain.Book;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface BookRepository extends JpaRepository<Book,Long> {
}
