package web.service.rest.api.web.app.restendpoint;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

// this my rest api class, even no need to add @Controller here
// inside @RestControoler contain @Controller
@RestController
@RequestMapping("/app")
public class FirstRestEndPoint {

	@GetMapping("/getmethod")  
	public String message() {
		return "I am http get method";
	}
	
	@PostMapping("/postmethod")  
	public String message1() {
		return "I am http post method";
	}
	
	@PutMapping("/putmethod")  
	public String message2() {
		return "I am http put method";
	}
	
	@DeleteMapping("/deletemethod")  
	public String message3() {
		return "I am http delete method";
	}
}

// http://localhost:8080/msg 
// http://localhost:8080/mail
// http://localhost:8080/text
