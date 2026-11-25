package example.hibernate.beans;

import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import example.hibernate.entity.Article;

public class HibernateUtils {

	public static SessionFactory getSessionFactory() {
		
		return new Configuration()
		.setProperty("hibernate.connection.driver_class", "com.mysql.cj.jdbc.Driver")
		.setProperty("hibernate.connection.url", "jdbc:mysql://localhost:3306/hibernate")
		.setProperty("hibernate.connection.username", "root")
		.setProperty("hibernate.connection.password", "Pass@123")
		.setProperty("hibernate.hbm2ddl.auto", "update")
		.setProperty("hibernate.show_sql", "true")
		.addAnnotatedClass(Article.class)
		.buildSessionFactory();
		
		/*Configuration conf= new Configuration();
		conf.setProperty("", "");
		conf.setProperty("", "");
		conf.setProperty("", "");
		conf.setProperty("", "");
		conf.setProperty("", "");
		conf.setProperty("", "");
		conf.addAnnotatedClass(Article.class);

		return conf.buildSessionFactory();*/
	
	}
}
