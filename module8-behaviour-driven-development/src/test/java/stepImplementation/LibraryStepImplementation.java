package stepImplementation;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import model.Book;
import model.Library;

import static org.junit.Assert.assertTrue;

public class LibraryStepImplementation {
    Library myLibrary = new Library("Carturesti");
    Book carte = new Book();

    @Given("^the online library is working$")
    public void theOnlineLibrarySystemIsWorking() {

//        boolean libraryStatus = myLibrary.isLibraryOpen();
//        assertTrue(libraryStatus);
    }

    @When("^I add a book in the library with title (.*) and author (.*) under category (.*)$")
    public void iAddTheBookIntoTheSystemWithTitleBookTitleAndAuthorSAuthorUnderCategoryCategory(String bookTitle, String authorName, String category) {

        carte.setBookTitle(bookTitle);
        carte.setCategory(category);
        carte.setAuthorName(authorName);
        myLibrary.addBookToLibrary(carte);


//        String actualBookTitle = carte.getBookTitle();
//        assertEquals(actualBookTitle, bookTitle);
    }

    @And("^publication year (.*)$")
    public void publicationYearPublicationYear(int publicationYear) {
        carte.setPublicationYear(publicationYear);


//        int actualBookYear = carte.getPublicationYear();
//        assertEquals(actualBookYear, publicationYear);
    }

    @And("^has a number of copies of (.*)$")
    public void hasANumberOfCopiesOfBookCopies(int bookCopiesNumber) {
        carte.setNumberOfCopies(bookCopiesNumber);


        if (bookCopiesNumber > 0) {
            carte.setStatus(true);
        } else {
            carte.setStatus(false);
        }


//        int actualBookCopies = carte.getNumberOfCopies();
//        assertEquals(actualBookCopies, bookCopiesNumber);
    }

    @Then("^the book is available in the system with id (.*)$")
    public void theBookIsAvailableInTheSystemWithIdId(int id) {

        boolean isBookInTheLibrary = myLibrary.searchBookByID(carte, id);
        assertTrue(isBookInTheLibrary);
    }

    @Given("I have a list of books in the library")
    public void iHaveThePreviousListOfBooksInTheLibrary() {
        myLibrary.addAllBooksToLibrary();
    }

    @When("^the librarian searches for the book with title (.*)$")
    public void theLibrarianSearchesForTheBookWithTitleBookTitle(String title) {
        boolean hasTheBookBeenFoundInTheLibraryByName = myLibrary.findBookByTitle(title);
        assertTrue(hasTheBookBeenFoundInTheLibraryByName);
    }

    @Then("^the book has status (.*)$")
    public void theBookHasStatusStatus(String status) {
    }


}
