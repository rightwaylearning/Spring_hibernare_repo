package spring.rest.api.annotations.sample.annotations;

import java.util.ArrayList;
import java.util.List;

import org.springframework.http.MediaType;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

//Q] How to create any class as Rest Request handler  >>> with help of @RestController annotation

//@Controller
@RestController
public class UserRequestHandlerClass {
	private List<User> userList = new ArrayList<>();
	
	public UserRequestHandlerClass(){
		userList.add(new User(1,"Madhu", "sharma", "msharma"));
		userList.add(new User(2,"Rajiv","Bhatiya","bhatiyar"));
		userList.add(new User(3,"Abhi","raut","abhir"));
	}
	 // http://localhost:9091/user  >>> GET
	// here we are returning all user
	@GetMapping(path="/user",produces = MediaType.APPLICATION_JSON_VALUE)
	 public List<User> getAllUser(){
		return userList;
	}
	
	// here we are returning only one user object but which user?? client will sent id of that user
	
	// here I want to use path variable technique to read input value from uri 
	@GetMapping(path="/user/{userId}",produces = MediaType.APPLICATION_JSON_VALUE)
	 public User getUser(@PathVariable Integer userId) {
		
		System.out.println("userId = " + userId);

		for (User user : userList) {
			if(user.getUserId().equals(userId)) {
				return user;
			}
		}
		
		return null;
	}
	// here we are passing multiple parameter on uri & read it with help of @PathVariable
	@GetMapping(path="user/{userId}/{name}/{cellNo}",produces = MediaType.APPLICATION_JSON_VALUE)
	 public User getSingleUser(@PathVariable Integer userId,@PathVariable String name, @PathVariable Long cellNo) {
		System.out.println("userId = " +userId +", name = "+ name +", cellNo = "+cellNo);

		for (User user : userList) {
			if(user.getUserId().equals(userId)) {
				return user;
			}
		}
		
		return null;
	}
	
	@GetMapping(path="/users",produces = MediaType.APPLICATION_JSON_VALUE)
	 public User getUser1(@RequestParam Integer userId) {
		
		System.out.println("it's request param userId = " + userId);
		
		for (User user : userList) {
			if(user.getUserId().equals(userId)) {
				return user;
			}
		}
		
		return null;
	}
	
	@PostMapping(path="/user",produces = MediaType.APPLICATION_JSON_VALUE, consumes = MediaType.APPLICATION_JSON_VALUE)
	
	 public User saveUser(@RequestBody User user) {
		boolean status = userList.add(user);
		
		if (status) {
			return user;
		} else {
			return null;
		}
	}
	
	@DeleteMapping(path="/user/{userId}")
	public String deleteUser(@PathVariable Integer userId) {
		int index = -1;
		User u = null;
		for (User user : userList) {
			index++;
			if(user.getUserId().equals(userId)) {
				u = userList.remove(index);
				break;
			}
		}
		
		if(u != null) {
			return "deleted";
		}else {
			 return "sorry";
		}
	
	}
	
}
