package entity;

import javax.persistence.*;
import java.util.List;

@Entity
public class Author17 {
    @Id
    @GeneratedValue(strategy= GenerationType.IDENTITY)
    int id;
    String firstName;
    String lastName;
    int age;

    //bidirectional
    @ManyToMany
    @JoinTable(joinColumns = @JoinColumn(name="author_id")
            ,inverseJoinColumns = @JoinColumn(name = "book_id"))
    List<Book17> bookList;
    public Author17() {
    }

    public Author17(String firstName, String lastName, int age, List<Book17> bookList) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.age = age;
        this.bookList = bookList;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public List<Book17> getBookList() {
        return bookList;
    }

    public void setBookList(List<Book17> bookList) {
        this.bookList = bookList;
    }
}
