package rwl.apo.test.rwl_test;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Component;


@Aspect
@Component
public class ApectClass {

	Logger logger = LoggerFactory.getLogger(ApectClass.class);
	

	
//	@Before("pk1()")
//	public void msg(JoinPoint j) {
//		logger.info("Hi I am before advice" +j.getSignature().getName());
//	}
//	
//	@After("pk1()")
//	public void msg1(JoinPoint j) {
//		logger.info("Hi I am after advice"+j.getSignature().getName());
//		
//	}
	
	@Around("execution(* rwl.apo.test.rwl_test.RestApiController.getMessage(..))")
	public Object aroundAdv(ProceedingJoinPoint  joinPoint) throws Throwable {
		    String targetClass = joinPoint.getTarget().getClass().getSimpleName();
	        String targetMethod = joinPoint.getSignature().getName();
	        String arg =  null;//joinPoint.getArgs()[0].toString();

	        logger.info("Executing {}.{} with argument: {}", targetClass, targetMethod, arg);

	        Object data =  joinPoint.proceed();

	        logger.info("Method returned: {} .. end");
	        return data;
	}
	
}
