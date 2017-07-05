/*
package mypack;

import entity.Book;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

//Question 10,11,12 and 13
public class Application15 {
    public static void main(String[] args) {

        Book book1=new Book("Predictably Irrational");
        Book book2=new Book("A Tale of two cities");
        Author16b author=new Author16b("Pranav","Khurana",21,book1);
        Author16b author2=new Author16b("John","Doe",23,book1);
        Author16b author3=new Author16b( "Peter","Gayle",24,book2);

        SessionFactory sessionFactory=new Configuration().configure("hibernate15.cfg.xml").buildSessionFactory();
        Session session=sessionFactory.openSession();

        session.beginTransaction();
        session.save(author);
        session.save(author2);
        session.save(author3);
        session.save(book1);
        session.save(book2);
        session.getTransaction().commit();

        sessionFactory.close();
    }
}*/
