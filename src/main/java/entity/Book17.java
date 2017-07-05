package entity;

import javax.persistence.*;
import java.util.List;

@Entity
public class Book17 {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    int bookId;

    String bookName;

    @ManyToMany
    List<Author17> authorList;

    public Book17() {
    }

    public Book17(String bookName) {
        this.bookName = bookName;
    }

    public List<Author17> getAuthorList() {
        return authorList;
    }

    public void setAuthorList(List<Author17> authorList) {
        this.authorList = authorList;
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