package util;

import model.Book;

import java.util.ArrayList;
import java.util.List;

public abstract class BookUtilities {

    public static List<Book> loadBooks() {
        List<Book> myListOfBooks = new ArrayList<>();


        Book book1 = new Book();
        Book book2 = new Book();
        Book book3 = new Book();
        Book book4 = new Book();
        Book book5 = new Book();
        Book book6 = new Book();
        Book book7 = new Book();
        Book book8 = new Book();
        book1.setBookTitle("Art of programming calculators");
        book2.setBookTitle("Clean Code");
        book3.setBookTitle("Cracking the Coding Interview");
        book4.setBookTitle("Refactoring");
        book5.setBookTitle("Structure and Interpretation of Computer Programs");
        book6.setBookTitle("The Pragmatic Programmer");
        myListOfBooks.add(book1);
        myListOfBooks.add(book2);
        myListOfBooks.add(book3);
        myListOfBooks.add(book4);
        myListOfBooks.add(book5);
        myListOfBooks.add(book6);
        myListOfBooks.add(book7);
        myListOfBooks.add(book8);

        return myListOfBooks;
    }
}
