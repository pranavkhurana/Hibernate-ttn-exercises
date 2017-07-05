package mypack;

import entity.Author16b;
import entity.Book16b;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import java.util.ArrayList;
import java.util.List;

public class Application16b {
    public static void main(String[] args) {

        Book16b book1=new Book16b("Predictably Irrational");
        Book16b book2=new Book16b("A Tale of two cities");
        Book16b book3=new Book16b("Jungle book");
        Book16b book4=new Book16b("Good times");

        List<Book16b> bookList1=new ArrayList<Book16b>();
        bookList1.add(book1);
        bookList1.add(book2);
        List<Book16b> bookList2=new ArrayList<Book16b>();
        bookList2.add(book4);
        bookList2.add(book3);

        Author16b author=new Author16b("Pranav","Khurana",21,bookList1);
        Author16b author2=new Author16b("John","Doe",23,bookList2);

        book1.setAuthor(author);
        book2.setAuthor(author);
        book3.setAuthor(author2);
        book4.setAuthor(author2);

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