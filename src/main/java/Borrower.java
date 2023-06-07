import java.util.ArrayList;

public class Borrower {

    private ArrayList<Book> books;

    public Borrower() {
        this.books = new ArrayList<>();
    }

    public Book takeBookFromLibrary(Library library){
        Book book = library.takeBookFromLibrary();
        return book;
    }

    public void addBook(Book book){
        books.add(book);
    }

    public int bookCount(){
        return books.size();
    }

}
