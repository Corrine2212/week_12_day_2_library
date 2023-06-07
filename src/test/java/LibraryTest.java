import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class LibraryTest {

    private Library library;
    private Book book;


    @Before
    public void before(){
        library = new Library();
        book = new Book("For Whom The Bell Tolls", "Ernest Hemingway", "Classics");
    }

    @Test
    public void canAddBookToLibrary(){
        library.addBookToLibrary(book);
        assertEquals(1, library.bookCount());
    }

    @Test
    public void canCountBooks(){
        library.bookCount();
        assertEquals(0, library.bookCount());
    }

    @Test
    public void libraryhasCapacity(){
        assertEquals(5, library.getCapacity());
    }

    @Test
    public void doNotAddOverCapacity(){
        library.addBookToLibrary(book);
        library.addBookToLibrary(book);
        library.addBookToLibrary(book);
        library.addBookToLibrary(book);
        library.addBookToLibrary(book);
        assertEquals(5, library.bookCount());
    }


}

