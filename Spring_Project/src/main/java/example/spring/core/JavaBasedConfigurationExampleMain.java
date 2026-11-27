package example.spring.core;

import java.util.List;

import org.springframework.context.ApplicationContext;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class JavaBasedConfigurationExampleMain {
	public static void main(String[] args) {
		
		//SpringConfig
		
		ApplicationContext appCtx = new AnnotationConfigApplicationContext(SpringConfig.class);
		
		Object obj = appCtx.getBean("getHelloSerivce");
		GreetingService gs = (GreetingService)obj;
		System.out.println(gs.sayGreeting());
		
		
		System.out.println("=======================");
		List<String>allMovies = (List<String>) appCtx.getBean("movies");
		
		allMovies.stream().forEach(movie->System.out.println(movie));
		
		
		
	}

}
