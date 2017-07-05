package mypack;

import entity.Author7;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class Application7 {
    public static void main(String[] args) {
        SessionFactory sessionFactory=new Configuration().configure("hibernate7.cfg.xml").buildSessionFactory();
        Session session=sessionFactory.openSession();
        session.beginTransaction();
        session.save(new Author7("John","Doe",21));
        session.getTransaction().commit();
        sessionFactory.close();
    }
}