package guru.springframework.spring6webapp.bootstrap;

// created by kp on 3/12/2023

import guru.springframework.spring6webapp.domain.Author;
import guru.springframework.spring6webapp.domain.Book;
import guru.springframework.spring6webapp.domain.Publisher;
import guru.springframework.spring6webapp.repositories.AuthorRepository;
import guru.springframework.spring6webapp.repositories.BookRepository;
import guru.springframework.spring6webapp.repositories.PublisherRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

@RequiredArgsConstructor
@Component
public class BootstrapData implements CommandLineRunner {

    private final AuthorRepository authorRepository;
    private final BookRepository bookRepository;
    private final PublisherRepository publisherRepository;

    @Override
    public void run(String... args) throws Exception {
        Author eric = new Author();
        eric.setFirstName("Eric");
        eric.setLastName("Evans");
        Author rod = new Author("Rod", "Johnson");
        Author ericSaved = authorRepository.save(eric);
        Author rodSaved = authorRepository.save(rod);

        Book ddd = new Book();
        ddd.setTitle("Domain Driven Design: Tackling Complexity in the Heart of Software");
        ddd.setIsbn("0321125215");
        Book noEJB = new Book("J2EE Development without EJB", "978-0-764-57390-3");
        Book dddSaved = bookRepository.save(ddd);
        Book noEJBSaved = bookRepository.save(noEJB);

        Publisher addison = new Publisher("Addison-Wesley Professional","501 Boylston St, Ste 900", "Boston", "MA", "02116-3725");
        Publisher wiley = new Publisher("John Wiley & Sons", "1 Wiley Dr", "Somerset", "NJ", "08873");
        Publisher addisonSaved = publisherRepository.save(addison);
        Publisher wileySaved = publisherRepository.save(wiley);

        ddd.setPublisher(addisonSaved);
        noEJB.setPublisher(wileySaved);

        ericSaved.getBooks().add(dddSaved);
        rodSaved.getBooks().add(noEJBSaved);
        dddSaved.getAuthors().add(ericSaved);
        noEJBSaved.getAuthors().add(rodSaved);

        authorRepository.save(ericSaved);
        authorRepository.save(rodSaved);
        bookRepository.save(dddSaved);
        bookRepository.save(noEJBSaved);

        System.out.println("In Bootstrap");
        System.out.println("Author Count: " + authorRepository.count());
        System.out.println("Book Count: " + bookRepository.count());
        System.out.println("Publisher Count: " + publisherRepository.count());
    }
}
