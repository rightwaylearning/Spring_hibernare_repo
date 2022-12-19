package com.web.service.webapp;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.GetMapping;

@RestController
public class MyFirstRestApi {

	 @GetMapping("message")
	 public String getMessage() {
		 return "Good morning..";
	 }
}
