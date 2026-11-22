package Book;

public class Book implements Prototype {
    public String title;
    public String author;
    public int publicationyear;
    public String genre;

    public Book(String title, String author, int publicationyear, String genre) {
        this.title = title;
        this.author = author;
        this.publicationyear = publicationyear;
        this.genre = genre;
    }
    public String getTitle() {
        return title;
    }
    public void setTitle(String title) {
        this.title = title;
    }
    public String getAuthor() {
        return author;
    }
    public Book clone() {
        return new Book(title, author, publicationyear, genre);
    }

    @Override
    public String toString() {
        return "\"" + title + "\" by " + author + " (" + publicationyear + ", " + genre + ")";
    }
}

