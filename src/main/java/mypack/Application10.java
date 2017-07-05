package mypack;

import entity.Address;
import entity.Author10;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import java.util.ArrayList;
import java.util.List;

//Question 10,11,12 and 13
public class Application10 {
    public static void main(String[] args) {

        List<String> bookList=new ArrayList<String>();
        bookList.add("book1");
        bookList.add("book2");
        bookList.add("book3");
        List<String> bookList2=new ArrayList<String>();
        bookList2.add("book1");
        bookList2.add("book4");
        bookList2.add("book5");

        Author10 author=new Author10("Pranav","Khurana",21,new Address(242,"Dwarka","Delhi"),bookList);
        Author10 author2=new Author10("John","Doe",23,new Address(114,"West Avenue","Delhi"),bookList2);

        SessionFactory sessionFactory=new Configuration().configure("hibernate10.cfg.xml").buildSessionFactory();
        Session session=sessionFactory.openSession();

        session.beginTransaction();
        session.save(author);
        session.save(author2);
        session.save(author2);
        session.getTransaction().commit();

        sessionFactory.close();
    }
}