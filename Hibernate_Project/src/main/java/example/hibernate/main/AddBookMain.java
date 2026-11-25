package example.hibernate.main;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import example.hibernate.entity.Book;

public class AddBookMain {

	public static void main(String[] args) {
		
		Session session = null;
		SessionFactory sf = null;
		
		try {
			
			Configuration conf = new Configuration();
			conf= conf.configure();//
			sf=conf.buildSessionFactory();//it will build entire session factory
			session = sf.openSession();
			
			Book bookObj =new Book(102,"2 states","chetan bhagat");
			Transaction tx= session.beginTransaction();
			session.persist(bookObj);//Storing book object  as record into database
			
			tx.commit();
			System.out.println("Book Added Successfully");
			
		}
		catch(Exception ex){
			
			ex.printStackTrace();
		
		}finally {
			session.close();
			sf.close();
		}
		
	}

}
