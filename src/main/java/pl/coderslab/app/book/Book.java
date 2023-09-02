package pl.coderslab.app.book;


import javax.persistence.*;
import java.math.BigDecimal;

@Entity
@Table(name = "books")
public class Book {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @Column(nullable = false)
    private String title;
    private Integer rating;
    @Column(length = 1024)
    private String description;

    public Long getId() {
        return id;
    }

    public String getTitle() {
        return title;
    }

    @Override
    public String toString() {
        return "Book{" + "id=" + id + ", title='" + title + '\'' + ", reting=" + rating + ", description='" + description + '\'' + '}';
    }

    public Integer getReting() {
        return rating;
    }

    public String getDescription() {
        return description;
    }


}
