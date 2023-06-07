import java.util.ArrayList;

public class Library {

    private ArrayList<Book> books;
    private int capacity;

    public Library(){
        this.books = new ArrayList<>();
        this.capacity = 5;
    }

    public int bookCount() {
        return this.books.size();
    };

    public void addBookToLibrary(Book book) {
        if(this.bookCount() < this.capacity) {
        this.books.add(book);}
    }

    public Book takeBookFromLibrary(){
        return this.books.remove(0);
    }
    public int getCapacity() {
        return this.capacity;
    }
}
