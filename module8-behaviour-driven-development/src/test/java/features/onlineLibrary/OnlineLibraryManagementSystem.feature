Feature: Online Library Management System

  Scenariu 1- Carte noua adaugata in stoc
  Scenariu 2- Daca exista cartea in stoc
  Scenariu 3- Verifica cate copii ale carti exista in biblioteca

  Scenario Outline: Verify that a book can be added in the online library
    Given the online library is working
    When I add a book in the library with title <bookTitle> and author <authorName> under category <bookCategory>
    And publication year <publicationYear>
    And has a number of copies of <bookCopies>
    Then the book is available in the system with id <id>
    Examples:
      | authorName                         | bookCategory        | bookTitle                                         | bookCopies | publicationYear | id |
      | Andrew Hunt, David Thomas          | programming         | The Pragmatic Programmer                          | 3          | 2005            | 1  |
      | Robert C. Martin                   | programming         | Clean Code                                        | 45         | 2000            | 2  |
      | Harold Abelson, Gerald Jay Sussman | programming         | Structure and Interpretation of Computer Programs | 6          | 1950            | 3  |
      | Donald E. Knuth                    | programming         | Art of programming calculators                    | 7          | 2010            | 4  |
      | Gayle Laakmann McDowell            | programming         | Cracking the Coding Interview                     | 9          | 1950            | 5  |
      | Martin Fowler, Kent Beck           | programming         | Refactoring                                       | 2          | 1950            | 6  |
      | Robert Kiyosaki                    | financial education | Rich Dad, Poor Dad                                | 3          | 1950            | 7  |
      | George Samuel Clason               | financial education | The richest man in Babylon                        | 0          | 1950            | 8  |


  Scenario Outline: Verify that a book is available in stock
    Given I have a list of books in the library
    When the librarian searches for the book with title <bookTitle>
    Then the book has status <status>
    Examples:
      | bookTitle                                         | status      |
      | Art of programming calculators                    | available   |
      | Clean Code                                        | unavailable |
      | Cracking the Coding Interview                     | available   |
      | Refactoring                                       | available   |
      | Structure and Interpretation of Computer Programs | unavailable |
      | The Pragmatic Programmer                          | unavailable |


  Scenario Outline: Verify number of available copies of a book in the library
    Given I have a list of books in the library
    And the user searches for the book with title <bookTitle>
    When he finds the book in the system and checks the number of copies
    Then he finds out that there are <bookCopies> books with the title <bookTitle> in the library
    Examples:
      | bookTitle                                         | bookCopies |
      | Art of programming calculators                    | 3          |
      | Clean Code                                        | 45         |
      | Cracking the Coding Interview                     | 6          |
      | Refactoring                                       | 7          |
      | Structure and Interpretation of Computer Programs | 9          |
      | The Pragmatic Programmer                          | 2          |
      | Rich Dad, Poor Dad                                | 3          |