package example.spring.core;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class DependencyInjectionExampleMain {
	public static void main(String[] args) {
		
		ApplicationContext appCtx = new AnnotationConfigApplicationContext(SpringConfig.class);
		 Object emp1 = appCtx.getBean("emp");
		 Object emp2 = appCtx.getBean("anotherEmp");
		 System.out.println(emp1);
		 System.out.println(emp2);
	}

}
