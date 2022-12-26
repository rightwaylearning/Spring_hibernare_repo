package com.aop.example.aop.sample;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.AfterReturning;
import org.aspectj.lang.annotation.AfterThrowing;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.springframework.stereotype.Component;

@Component
@Aspect
public class AdviceServices {
   
	@Before("execution(* com.aop.example.aop.sample.BusinessLogic.*(..))")
	void beforeAdvice() {
		System.out.println("I am before advice please take it");
	}
	
	@After("execution(* com.aop.example.aop.sample.BusinessLogic.*(..))")
	void afterAdvice() {
		System.out.println("I am after advice");
	}
	
	@AfterReturning("execution(* com.aop.example.aop.sample.BusinessLogic.*(..))")
	void afterAdviceReturning() {
		System.out.println("I am after returning advice");
	}
	
	@AfterThrowing("execution(* com.aop.example.aop.sample.BusinessLogic.getMessage3(..))")
	void throwAdvice() {
		System.out.println("I am throw advice");
	}
	
	
	@Around("execution(* com.aop.example.aop.sample.BusinessLogic.*(..))")
	Object aroundAdvice(ProceedingJoinPoint jp) throws Throwable {
		System.out.println("i am before around advice");
		    
		Object data =   jp.proceed();
		
		System.out.println("i am after around advice");
		
		return data;
	}
	
}
