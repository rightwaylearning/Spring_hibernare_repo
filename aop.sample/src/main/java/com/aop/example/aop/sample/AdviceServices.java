package com.aop.example.aop.sample;

import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.AfterReturning;
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
	
	
}
