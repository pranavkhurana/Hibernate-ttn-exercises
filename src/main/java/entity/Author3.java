package entity;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import java.util.Date;

@Entity
public class Author3 {
    @Id
    String firstName;
    String lastName;
    int age;
    @Temporal(TemporalType.DATE)
    Date dateOfBirth;

}
