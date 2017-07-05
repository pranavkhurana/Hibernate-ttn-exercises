package entity;

import org.hibernate.annotations.GenericGenerator;

import javax.persistence.*;

@Entity
public class Author9b {
    @Id
    @TableGenerator(
            name="table",
            allocationSize=20
    )
    @GeneratedValue(generator="table",strategy= GenerationType.TABLE)

    int id;
    String firstName;
    String lastName;
    int age;

    public Author9b() {
    }

    public Author9b(String firstName, String lastName, int age) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.age = age;
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

    @Override
    public String toString() {
        return "Author9b{" +
                "firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", age=" + age +
                '}';
    }
}
