package spring.rest.api.annotations.sample.annotations;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class GetMethodWithRequestParam {

	@GetMapping("/employee")
	public String getMsg(@RequestParam("name") String name,@RequestParam("pwd") String pwd) {
		return "name =  " + name +"  pwd " + pwd;
	}
	
}
