package guru.springframework.spring6webapp.domain;

// created by kp on 3/13/2023

import jakarta.persistence.*;
import lombok.*;

import java.util.Objects;
import java.util.Set;

@NoArgsConstructor
@Getter
@Setter
@ToString(onlyExplicitlyIncluded = true)
@Entity
public class Publisher {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    @ToString.Include
    private String publisherName;

    @ToString.Include
    private String publisherAddress;

    @ToString.Include
    private String publisherCity;

    @ToString.Include
    private String publisherState;

    @ToString.Include
    private String publisherZipcode;

    @ToString.Include
    @OneToMany(mappedBy = "publisher")
    private Set<Book> books;

    public Publisher(String publisherName, String publisherAddress, String publisherCity, String publisherState, String publisherZipcode) {
        this.publisherName = publisherName;
        this.publisherAddress = publisherAddress;
        this.publisherCity = publisherCity;
        this.publisherState = publisherState;
        this.publisherZipcode = publisherZipcode;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Publisher publisher = (Publisher) o;
        return id.equals(publisher.id);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id);
    }
}
