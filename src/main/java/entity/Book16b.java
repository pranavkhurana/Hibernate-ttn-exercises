package entity;

import javax.persistence.*;

@Entity
public class Book16b {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    int bookId;

    String bookName;

    @ManyToOne
    Author16b author;

    public Book16b() {
    }

    public Book16b(String bookName) {
        this.bookName = bookName;
    }

    public Author16b getAuthor() {
        return author;
    }

    public void setAuthor(Author16b author) {
        this.author = author;
    }

    public int getBookId() {
        return bookId;
    }

    public void setBookId(int bookId) {
        this.bookId = bookId;
    }

    public String getBookName() {
        return bookName;
    }

    public void setBookName(String bookName) {
        this.bookName = bookName;
    }
}