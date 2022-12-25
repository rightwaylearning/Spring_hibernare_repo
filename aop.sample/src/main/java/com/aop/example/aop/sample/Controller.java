package com.aop.example.aop.sample;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/aop")
public class Controller {
	
	@Autowired
	BusinessLogic businessLogic;

	@GetMapping
	@RequestMapping("/first")
	public String getFirst() {
		return businessLogic.getMessage1();
	}
	
	@GetMapping
	@RequestMapping("/second")
    public String getSecond() {
		return businessLogic.getMessage2();
	}
}
