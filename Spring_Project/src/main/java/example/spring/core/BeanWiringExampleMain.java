package example.spring.core;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class BeanWiringExampleMain {

	public static void main(String[] args) {
		
		
		ApplicationContext appCtx = new AnnotationConfigApplicationContext(SpringConfig.class);
		Object appCust = appCtx.getBean("cust");
		System.out.println(appCust);
		// TODO Auto-generated method stub

	}

}
