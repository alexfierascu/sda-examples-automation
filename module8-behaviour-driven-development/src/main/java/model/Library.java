package model;

import lombok.Getter;
import lombok.Setter;

import java.util.ArrayList;
import java.util.List;

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
}
