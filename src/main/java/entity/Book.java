package entity;

import javax.persistence.*;

//This class added for Question 14
@Entity
public class Book {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    int bookId;

    String bookName;

    public Book() {
    }

    public Book(String bookName) {
        this.bookName = bookName;
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