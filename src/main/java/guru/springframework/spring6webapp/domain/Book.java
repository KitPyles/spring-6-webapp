package guru.springframework.spring6webapp.domain;

// created by kp on 3/12/2023

import jakarta.persistence.*;
import lombok.*;
import java.util.HashSet;
import java.util.Set;

@NoArgsConstructor
@Getter
@Setter
@ToString(onlyExplicitlyIncluded = true)
@Entity
public class Book {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    @ToString.Include
    private String title;

    @ToString.Include
    private String isbn;

    @ToString.Include
    @ManyToMany
    @JoinTable(name = "author_book", joinColumns = @JoinColumn(name = "book_id"),
        inverseJoinColumns = @JoinColumn(name = "author_id"))
    private Set<Author> authors = new HashSet<>();

    @ToString.Include
    @ManyToOne
    private Publisher publisher;

    public Book(String title, String isbn) {
        this.title = title;
        this.isbn = isbn;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Book)) return false;

        Book book = (Book) o;

        return getId() != null ? getId().equals(book.getId()) : book.getId() == null;
    }

    @Override
    public int hashCode() {
        return getId() != null ? getId().hashCode() : 0;
    }
}