package entity;

import javax.persistence.*;
import java.util.List;

@Entity
public class Author16c {
    @Id
    @GeneratedValue(strategy= GenerationType.IDENTITY)
    int id;
    String firstName;
    String lastName;
    int age;

    //bidirectional
    @OneToMany(mappedBy = "author",cascade = CascadeType.PERSIST)
    List<Book16c> bookList;
    public Author16c() {
    }

    public Author16c(String firstName, String lastName, int age, List<Book16c> bookList) {
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

    public List<Book16c> getBookList() {
        return bookList;
    }

    public void setBookList(List<Book16c> bookList) {
        this.bookList = bookList;
    }
}
