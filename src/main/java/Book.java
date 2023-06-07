public class Book {

    private String title;
    private String author;
    private String genre;

    public Book(String title, String author, String genre ) {
        this.title = title;
        this.author = author;
        this.genre = genre;
    }

    public String getBookTitle(){
        return this.title;
    }
    public String getBookAuthor(){
        return this.author;
    }
    public String getBookGenre(){
        return this.genre;
    }


}

