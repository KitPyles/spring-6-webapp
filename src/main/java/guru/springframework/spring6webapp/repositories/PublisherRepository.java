package guru.springframework.spring6webapp.repositories;

// created by kp on 3/13/2023

import guru.springframework.spring6webapp.domain.Publisher;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PublisherRepository extends JpaRepository<Publisher, Long> {
}
