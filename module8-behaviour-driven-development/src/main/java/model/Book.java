package model;

import lombok.Getter;
import lombok.Setter;

import java.util.concurrent.atomic.AtomicInteger;

@Getter
@Setter
public class Book {

    private static AtomicInteger ID_GENERATOR = new AtomicInteger(1);

    private int id;
    private String bookTitle;
    private String category;
    private int publicationYear;
    private int numberOfCopies;
    private String authorName;
    private boolean status;

    public Book() {
        this.id = ID_GENERATOR.getAndIncrement();
    }

}
