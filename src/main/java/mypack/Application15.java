package mypack;

import entity.Author15;
import entity.Book;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class Application15 {
    public static void main(String[] args) {

        Book book1=new Book("Predictably Irrational");
        Book book2=new Book("A Tale of two cities");
        Book book3=new Book("Garfield");
        Author15 author=new Author15("Pranav","Khurana",21,book1);
        Author15 author2=new Author15("John","Doe",23,book2);
        Author15 author3=new Author15( "Peter","Gayle",24,book3);

        SessionFactory sessionFactory=new Configuration().configure("hibernate15.cfg.xml").buildSessionFactory();
        Session session=sessionFactory.openSession();

        session.beginTransaction();
        session.save(author);
        session.save(author2);
        session.save(author3);
        session.save(book1);
        session.save(book2);
        session.save(book3);
        session.getTransaction().commit();

        sessionFactory.close();
    }
}
