package Book;

import java.util.ArrayList;
import java.util.List;

public class Recommendation implements Prototype {

    private String targetaudience;
    private List<Book> bookList;


    public Recommendation(String targetaudience, List<Book> bookList) {
        this.targetaudience = targetaudience;
        this.bookList = new ArrayList<>();
        for (Book book : bookList) {
            this.bookList.add(book.clone());
        }

    }
    public String getTargetaudience() {
        return targetaudience;
    }
    public void setTargetaudience(String targetaudience) {
        this.targetaudience = targetaudience;

    }
    public List<Book> getBookList() {
        return bookList;
    }
    public void addBook(Book book) {
        this.bookList.add(book);
    }
    public void removeBook(Book book) {
        bookList.remove(book);
    }
    public boolean removeBookbyTitle(String title) {
        return this.bookList.removeIf(book -> book.getTitle().equalsIgnoreCase(title));
    }




    @Override
    public Recommendation clone() {
        return new Recommendation(this.targetaudience, this.bookList);
    }

    @Override
    public String toString() {
        return targetaudience + " -> " + bookList;
    }
}



