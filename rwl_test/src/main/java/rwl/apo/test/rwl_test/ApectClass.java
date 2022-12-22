package rwl.apo.test.rwl_test;

import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;
import org.springframework.stereotype.Component;

@Aspect
@Component
public class ApectClass {

	@Pointcut("execution(* *.getData*(..))")
	public void pk1() {}
	
	@Before("pk1()")
	public void msg() {
		System.out.println("I am before advice");
	}
	
	@After("pk1()")
	public void msg1() {
		System.out.println("I am after advice");
	}
	
}
