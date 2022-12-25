package com.aop.example.aop.sample;

import org.springframework.stereotype.Service;

@Service
public class BusinessLogic {

	public String getMessage1() {
		System.out.println("I need both advice");
		return "I need both advice";
	}
	
	public String getMessage2() {
		int i= 10/0;
		System.out.println("I need both advice");
		return "I need both advice";
	}
}
