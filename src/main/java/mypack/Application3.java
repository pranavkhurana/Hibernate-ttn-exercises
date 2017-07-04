package mypack;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class Application3 {
    public static void main(String[] args) {
        SessionFactory sessionFactory=new Configuration().configure("hibernate3.cfg.xml").buildSessionFactory();
    }
}
