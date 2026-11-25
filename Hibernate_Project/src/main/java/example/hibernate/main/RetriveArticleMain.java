package example.hibernate.main;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import example.hibernate.beans.HibernateUtils;
import example.hibernate.entity.Article;

public class RetriveArticleMain {

	public static void main(String[]args) {
		try(
				SessionFactory sf = HibernateUtils.getSessionFactory();
				Session session = sf.openSession();
				){
			Class<Article>entityClass = Article.class;
			Integer id =2;
			Article  foundArticle = session.find(entityClass, 30);
			if(foundArticle!=null)
				System.out.println(foundArticle);
			else 
				System.out.println("Article Not Found");
			System.out.println(foundArticle);
			
		}
		
		catch(Exception ex) {
			ex.printStackTrace();
		}
		
		
		
	}

}
