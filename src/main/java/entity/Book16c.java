package entity;

import javax.persistence.*;

@Entity
public class Book16c {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    int bookId;

    String bookName;

    @ManyToOne
    Author16c author;

    public Book16c() {
    }

    public Book16c(String bookName) {
        this.bookName = bookName;
    }

    public Author16c getAuthor() {
        return author;
    }

    public void setAuthor(Author16c author) {
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