package mypack;

import entity.Author16c;
import entity.Book16c;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import java.util.ArrayList;
import java.util.List;

//Question 16c and 16d(ie cascading is also done in this example)
public class Application16c {
    public static void main(String[] args) {

        Book16c book1 = new Book16c("Predictably Irrational");
        Book16c book2 = new Book16c("A Tale of two cities");
        Book16c book3 = new Book16c("Jungle book");
        Book16c book4 = new Book16c("Good times");

        List<Book16c> bookList1 = new ArrayList<Book16c>();
        bookList1.add(book1);
        bookList1.add(book2);
        List<Book16c> bookList2 = new ArrayList<Book16c>();
        bookList2.add(book4);
        bookList2.add(book3);

        Author16c author = new Author16c("Pranav", "Khurana", 21, bookList1);
        Author16c author2 = new Author16c("John", "Doe", 23, bookList2);

        book1.setAuthor(author);
        book2.setAuthor(author);
        book3.setAuthor(author2);
        book4.setAuthor(author2);

        SessionFactory sessionFactory = new Configuration().configure("hibernate16.cfg.xml").buildSessionFactory();
        Session session = sessionFactory.openSession();

        session.beginTransaction();
        //session.save(book1);
        //session.save(book2);
        //session.save(book3);
        //session.save(book4);
        session.save(author);
        session.save(author2);
        session.getTransaction().commit();
        sessionFactory.close();
    }
}