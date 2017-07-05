package mypack;

import entity.Author9;
import entity.Author9b;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

//Run twice to see the differece in generation strategys
public class Application10 {
    public static void main(String[] args) {
        SessionFactory sessionFactory=new Configuration().configure("hibernate9.cfg.xml").buildSessionFactory();
        Session session=sessionFactory.openSession();

        session.beginTransaction();
        session.save(new Author9("John","Doe",21));
        session.save(new Author9("Peter","Baelish",30));
        session.save(new Author9("David","William",21));

        session.save(new Author9b("John","Doe",21));
        session.save(new Author9b("Peter","Baelish",30));
        session.save(new Author9b("David","William",21));
        session.getTransaction().commit();

        sessionFactory.close();
    }
}