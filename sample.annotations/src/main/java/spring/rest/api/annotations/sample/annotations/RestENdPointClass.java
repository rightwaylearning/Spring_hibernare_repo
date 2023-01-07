package spring.rest.api.annotations.sample.annotations;

import org.springframework.http.HttpMethod;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

// http://localhost:9091/message   >>> GET
//http://localhost:9091/app/test   >>> GET
//http://localhost:9091/app/hi   >>> GET

@RestController 
public class RestENdPointClass {

	@GetMapping(path="/message")
	public String getMsg() {
		return "hello";
	}
	
	@GetMapping(path="/test")
	public String getMsg1() {
		return "test";
	}
	
	@GetMapping(path="/hi")
	public String getMsg2() {
		return "hi";
	}
}
