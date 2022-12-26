package com.web.service.webapp;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@RestController
@RequestMapping("/app")
public class MyFirstRestApi {
	
	 @Value("${welcome.message}")
	 String message;

	 @GetMapping("/message")
	 public String getMessage() {
		 return message;
	 }
}
