package com.event.listener.demo;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class RestControllerClass {

	@Value("${data.url}")
	public String url;
	
	@GetMapping
	public String getData() {
		return "hello "+ url;
	}
}
