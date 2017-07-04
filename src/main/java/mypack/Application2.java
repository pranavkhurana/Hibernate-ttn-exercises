package mypack;

import entity.Author2;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class Application2 {
    public static void main(String[] args) {

        Author2 author=new Author2("pranav","khurana",21);

        SessionFactory sessionFactory=new Configuration().configure().buildSessionFactory();
        Session session=sessionFactory.openSession();

        //Data is persisted in database only after a tx is commited
        session.beginTransaction();
        session.save(author);   //create
        session.getTransaction().commit();

        session.beginTransaction();
        Author2 author1=session.get(Author2.class,"pranav");//read
        System.out.println(author1);
        session.getTransaction().commit();

        session.beginTransaction();
        author.setAge(22);     //update (object is in persistent state because delete() was never called)
        session.getTransaction().commit();

        session.beginTransaction();
        Author2 author2=session.get(Author2.class,"pranav");//read again to verify update and delete
        System.out.println(author2);
        session.getTransaction().commit();

        session.beginTransaction();
        session.delete(author2); //delete
        session.getTransaction().commit();

    }
}
