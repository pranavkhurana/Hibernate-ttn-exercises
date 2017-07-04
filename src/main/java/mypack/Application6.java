package mypack;

import entity.Author5;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class Application6 {
    public static void main(String[] args) {
        //only hibernate5.cfg.xml is changed from hibernate4.cfg.xml
        SessionFactory sessionFactory=new Configuration().configure("hibernate5.cfg.xml").buildSessionFactory();
        Session session=sessionFactory.openSession();
        session.beginTransaction();
        session.save(new Author5("John","Doe",21));
        session.getTransaction().commit();
        sessionFactory.close();
    }
}