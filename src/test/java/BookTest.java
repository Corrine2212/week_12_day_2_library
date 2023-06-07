import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class BookTest {

    private Book book;

    @Before
    public void before(){
        book = new Book("For Whom The Bell Tolls", "Ernest Hemingway", "Classics");
    }

    @Test
    public void bookHasTitle(){
        assertEquals("For Whom The Bell Tolls", book.getBookTitle());
    }

    @Test
    public void bookHasAuthor(){
        assertEquals("Ernest Hemingway", book.getBookAuthor());
    }
    @Test
    public void bookHasGenre(){
        assertEquals("Classics", book.getBookGenre());
    }


}
