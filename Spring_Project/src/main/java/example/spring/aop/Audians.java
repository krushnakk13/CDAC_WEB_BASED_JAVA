package example.spring.aop;

import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.AfterReturning;
import org.aspectj.lang.annotation.AfterThrowing;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;
import org.springframework.stereotype.Component;

//@Component
@Aspect //Mark this class as an aspect
public class Audians {
	
	@Pointcut("execution(* example.spring.aop.Musician.perform(..))")
	private void myPointCut() {}
	
	@Before("myPointCut()")
	public void takeSeats() {
		
		System.out.println("Please  Take Seat...");
		
	}
	
	@Before("myPointCut()")
    public void turnOffMobiles() {
		
		System.out.println("Please  Turn off Mobiles...");
		
	}
    
	@AfterReturning("myPointCut()")
    public void clap() {
		
		System.out.println("clap clap clap");
		
	}
    
	@AfterThrowing("myPointCut()")
    public void demandForRefund() {
		
		System.out.println("Please give me my money back...");
		
	}

	@After("myPointCut()")
    public void leave() {
		
		System.out.println("Bye... Leavining now");
		
	}
}
