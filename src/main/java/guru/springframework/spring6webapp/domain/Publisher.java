package guru.springframework.spring6webapp.domain;

// created by kp on 3/13/2023

import jakarta.persistence.*;
import lombok.*;
import java.util.Set;

@NoArgsConstructor
@Getter
@Setter
@EqualsAndHashCode(onlyExplicitlyIncluded = true)
@ToString(onlyExplicitlyIncluded = true)
@Entity
public class Publisher {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @EqualsAndHashCode.Include
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

    public Publisher(String publisherName, String publisherAddress, String publisherCity, String publisherState, String publisherZipcode) {
        this.publisherName = publisherName;
        this.publisherAddress = publisherAddress;
        this.publisherCity = publisherCity;
        this.publisherState = publisherState;
        this.publisherZipcode = publisherZipcode;
    }
}
