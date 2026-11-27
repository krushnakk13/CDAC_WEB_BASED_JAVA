package example.spring.aop;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.AfterReturning;
import org.aspectj.lang.annotation.AfterThrowing;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;
import org.springframework.stereotype.Component;

@Component
@Aspect //Mark this class as an aspect
public class AudiansAround {
	
	@Pointcut("execution(* example.spring.aop.*.perform(..))")
	private void myPointCut() {}
	
	
	private  void takeSeats() {
		
		System.out.println("Please  Take Seat...Around");
		
	}
	
	
    private void turnOffMobiles() {
		
		System.out.println("Please  Turn off Mobiles...Around");
		
	}
    
	
    private void clap() {
		
		System.out.println("clap clap clap...Around");
		
	}
    
	
    private void demandForRefund() {
		
		System.out.println("Please give me my money back...Around");
		
	}

	
    private  void leave() {
		
		System.out.println("Bye... Leavining now...Around");
		
	}
    
    @Around("myPointCut()")
    public void monitorPerformance(ProceedingJoinPoint joinPoint) {
    	
    	try {
    		takeSeats();
        	turnOffMobiles();
			joinPoint.proceed();
			clap();
		} catch (Throwable e) {
			// TODO Auto-generated catch block
			//e.printStackTrace();
			demandForRefund();
		}
    	leave();
    }
}
