package model;

import lombok.Getter;
import lombok.Setter;
import util.BookUtilities;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

@Getter
@Setter
public class Library {
    private String libraryName;
    private List<Book> bookList;
    private boolean isLibraryOpen;

    public Library(String name) {
        this.libraryName = name;
        this.isLibraryOpen = true;
        this.bookList = new ArrayList<>();
    }

    public void addBookToLibrary(Book myBook) {
        bookList.add(myBook);
    }

    public boolean searchBookByID(Book myBook, int expectedId) {
        boolean flag;
        int actualId = myBook.getId();
        if (actualId == expectedId) {
            flag = true;
        } else {
            flag = false;
        }
        return flag;
    }

    public boolean findBookByTitle(String expectedTitle) {
        boolean flag = false;
        
        for (Book myBook : bookList) {
            String actualBookTitle = myBook.getBookTitle();
            if (actualBookTitle == expectedTitle) {
                flag = true;
            } else {
                flag = false;
            }
        }
        return flag;
    }

    public List<Book> addAllBooksToLibrary() {
        List<Book> booksFromFile = BookUtilities.loadBooks();

        bookList = Stream.of(booksFromFile)
                .flatMap(Collection::stream)
                .collect(Collectors.toList());
        return bookList;

    }
}
