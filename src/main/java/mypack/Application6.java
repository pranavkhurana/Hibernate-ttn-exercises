package mypack;

import entity.Author6;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class Application6 {
    public static void main(String[] args) {
        SessionFactory sessionFactory=new Configuration().configure("hibernate6.cfg.xml").buildSessionFactory();
        Session session=sessionFactory.openSession();
        session.beginTransaction();
        session.save(new Author6("John","Doe",21));
        session.getTransaction().commit();
        sessionFactory.close();
    }
}