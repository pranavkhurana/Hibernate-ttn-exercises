package mypack;

import entity.Author4;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import java.util.Date;
import java.util.GregorianCalendar;

//Question 4 and 8
public class Application4 {
    public static void main(String[] args) {

        SessionFactory sessionFactory=new Configuration().configure("hibernate4.cfg.xml").buildSessionFactory();
        Session session=sessionFactory.openSession();
        session.beginTransaction();
        session.save(new Author4("John","Doe",21, new GregorianCalendar(1996,1,5).getTime()));
        session.save(new Author4("Peter","Baelish",40, new GregorianCalendar(1977,5,24).getTime()));
        session.save(new Author4("Davin","William",20, new GregorianCalendar(1997,6,12).getTime()));
        session.save(new Author4("Jon","Snow",30, new GregorianCalendar(1987,11,10).getTime()));
        session.getTransaction().commit();

    }
}