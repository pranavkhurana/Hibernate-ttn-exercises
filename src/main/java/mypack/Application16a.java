package mypack;

import entity.Author16a;
import entity.Book;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;
import org.hibernate.engine.jdbc.connections.spi.ConnectionProvider;

import java.sql.DriverManager;
import java.util.ArrayList;
import java.util.List;

public class Application16a {
    public static void main(String[] args) {

        Book book1=new Book("Predictably Irrational");
        Book book2=new Book("A Tale of two cities");
        Book book3=new Book("Jungle book");
        Book book4=new Book("Good times");

        List<Book> bookList1=new ArrayList<Book>();
        bookList1.add(book1);
        bookList1.add(book2);
        List<Book> bookList2=new ArrayList<Book>();
        bookList2.add(book4);
        bookList2.add(book3);

        Author16a author=new Author16a("Pranav","Khurana",21,bookList1);
        Author16a author2=new Author16a("John","Doe",23,bookList2);

        SessionFactory sessionFactory=new Configuration().configure("hibernate16.cfg.xml").buildSessionFactory();
        Session session=sessionFactory.openSession();

        session.beginTransaction();
        session.save(book1);
        session.save(book2);
        session.save(book3);
        session.save(book4);
        session.save(author);
        session.save(author2);
        session.getTransaction().commit();
        sessionFactory.close();
    }
}