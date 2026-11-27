package example.spring.core;

import java.awt.print.Book;
import java.util.Arrays;
import java.util.List;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Lazy;
import org.springframework.context.annotation.Scope;


@Configuration  //this is used to marks the class as a connfiguration class
public class SpringConfig {
	//Declare  a bean of type HelloService

	@Bean // Marks this method  as a declaration method
	public HelloService getHelloSerivce() {
		return new  HelloService();
	}
	
	// <bean id = "getHelloService" class = "...HelloService"/>
	
	@Bean("movies") //Custoizing the id
	public List<String> getMovies(){  // if you not coustomize as movies then that case  this method id is  getMovies
		
		return Arrays.asList("Drisham" , "Drisham2" , "Dhurandar2"); 
		
	}
	
	
	@Bean("emp")   
	public Employee getEmployee() {  // Dependency Injection :- Setter Method
		Employee emp = new Employee();
		emp.setEmpNo(1001);
		emp.setName("Krushna");
		emp.setSal(56000.56f);
		return emp;
	}
	
	@Bean("anotherEmp")
	public Employee getAnotherEmployee() {   //Dependency Injection :- Parameterized Constructor Method
		Employee emp = new Employee(2443 , "Karale" , 58866.34f);
		return emp;
	}
	
	
	@Bean("bean1")
	@Lazy
	@Scope("prototype")
	public BeanImpl getBeanImpl() {
		return new BeanImpl();
	}
	
	
	@Bean("home")
	public Address getHomeAddress() {
		return new Address("Mumbai",422003);
	}
	
	@Bean("cust")
	public Customer getCustomer() {
		Customer cst = new  Customer("Sunil Kumar" ,"krushna@gmail.com",getHomeAddress());
		return cst;
	}
	
	@Bean("secondHome")
	public Address getSecondHomeAddress() {
		return new Address("Pune",422003);
	}
	
	
	/*@Bean("myBook")
	public Book getBook() {
		return new Book("Boardroom" , "Achyut Godbole");
	}
	
	@Bean("myBorrower")
	public Borrower getBorrower() {
		Borrower br = new Borrower()
		br.setId(120);
		br.setName("qwerfc");
		return br;
	}*/
	
	
	
	

}
