package spring.rest.api.annotations.sample.annotations;

import java.util.ArrayList;
import java.util.List;

import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

// http://localhost:9091/product/12
@RestController
public class RestEndPointWithParam {

	@GetMapping("/product/{productId}")
	public String getMessage(@PathVariable Integer productId) {
		return "I am product path get method "+ productId;
	}
	
	
	@PostMapping(path="/product", consumes = MediaType.APPLICATION_JSON_VALUE, produces = MediaType.APPLICATION_JSON_VALUE )
     public List<Employee> saveObject(@RequestBody Employee employee){
		
		employee.setFullName(employee.getFirstName() +" "+employee.getLastName());
		
		List<Employee> emp = new ArrayList<>();
		emp.add(employee);
		return emp;
	}







} 

class Employee{
	
	String firstName;
	String lastName;
	String fullName;
	
	public String getFirstName() {
		return firstName;
	}
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}
	public String getLastName() {
		return lastName;
	}
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
	public String getFullName() {
		return fullName;
	}
	public void setFullName(String fullName) {
		this.fullName = fullName;
	}
	
	
	
}
