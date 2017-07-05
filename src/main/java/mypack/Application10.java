package mypack;

import entity.Address;
import entity.Author10;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

//Run twice to see the differece in generation strategys
public class Application10 {
    public static void main(String[] args) {

        Author10 author=new Author10("pranav","khurana",21,new Address(242,"Dwarka","Delhi"));

        SessionFactory sessionFactory=new Configuration().configure("hibernate10.cfg.xml").buildSessionFactory();
        Session session=sessionFactory.openSession();

        session.beginTransaction();
        session.save(author);
        session.getTransaction().commit();

        sessionFactory.close();
    }
}