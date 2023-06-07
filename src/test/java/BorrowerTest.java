import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class BorrowerTest {

    private Borrower borrower;
    private Book book;
    private Library library;

    @Before
    public void before(){
        borrower = new Borrower();
        book = new Book("For Whom The Bells Tolls", "Ernest Hemingway", "Classics");
        library = new Library();
        library.addBookToLibrary(book);
    }

    @Test
    public void canBorrowBook(){
        borrower.takeBookFromLibrary(library);
        assertEquals(0, library.bookCount());
    }

    @Test
    public void canActuallyAddBookToCollection(){
        borrower.takeBookFromLibrary(library);
        borrower.addBook(book);
        assertEquals(1, borrower.bookCount());
    }
}
