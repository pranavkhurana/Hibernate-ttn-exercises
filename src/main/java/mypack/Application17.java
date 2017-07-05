package mypack;

import entity.Author17;
import entity.Book17;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import java.util.ArrayList;
import java.util.List;

public class Application17 {
    public static void main(String[] args) {

        Book17 book1=new Book17("Predictably Irrational");
        Book17 book2=new Book17("A Tale of two cities");
        Book17 book3=new Book17("Jungle book");
        Book17 book4=new Book17("Good times");

        List<Book17> bookList1=new ArrayList<Book17>();
        bookList1.add(book1);
        bookList1.add(book2);
        List<Book17> bookList2=new ArrayList<Book17>();
        bookList2.add(book4);
        bookList2.add(book3);
        List<Book17> bookList3=new ArrayList<Book17>();
        bookList3.add(book1);
        bookList3.add(book3);

        Author17 author=new Author17("Pranav","Khurana",21,bookList1);
        Author17 author2=new Author17("John","Doe",23,bookList2);
        Author17 author3=new Author17("James","Well",25,bookList3);

        List<Author17> authorList1=new ArrayList<Author17>();
        authorList1.add(author);
        authorList1.add(author3);
        List<Author17> authorList2=new ArrayList<Author17>();
        authorList2.add(author);
        List<Author17> authorList3=new ArrayList<Author17>();
        authorList3.add(author2);
        authorList3.add(author3);
        List<Author17> authorList4=new ArrayList<Author17>();
        authorList4.add(author2);

        book1.setAuthorList(authorList1);
        book2.setAuthorList(authorList2);
        book3.setAuthorList(authorList3);
        book4.setAuthorList(authorList4);

        SessionFactory sessionFactory=new Configuration().configure("hibernate17.cfg.xml").buildSessionFactory();
        Session session=sessionFactory.openSession();

        session.beginTransaction();
        session.save(book1);
        session.save(book2);
        session.save(book3);
        session.save(book4);
        session.save(author);
        session.save(author2);
        session.save(author3);
        session.getTransaction().commit();
        sessionFactory.close();
    }
}