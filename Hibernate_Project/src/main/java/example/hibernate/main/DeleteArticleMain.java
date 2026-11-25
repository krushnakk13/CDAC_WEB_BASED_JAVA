package example.hibernate.main;

import org.hibernate.Session;

import org.hibernate.SessionFactory;
import org.hibernate.Transaction;

import example.hibernate.beans.HibernateUtils;
import example.hibernate.entity.Article;


public class DeleteArticleMain {

	public static void main(String[]args) {
		try(
				SessionFactory sf = HibernateUtils.getSessionFactory();
				Session session = sf.openSession();
				){
			Class<Article>entityClass = Article.class;
			Article  foundArticle = session.find(Article.class, 2);
			if(foundArticle!=null) {
				Transaction tx =   session.beginTransaction();
				  session.remove(foundArticle);
			       
			       
			    tx.commit();
			       System.out.println("Article Deleted");
				
			}else {
				
				System.out.println("Article Not Found");
				
			}

		}
		
		catch(Exception ex) {
			ex.printStackTrace();
		}
		
		
		
	}

}
