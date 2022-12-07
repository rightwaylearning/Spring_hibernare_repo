package profile_info;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class kJadhav {
	
	@Value("${fname}")
	private String fisrtName;
	
	@Value("${lname}")
	private String lastName;
	
	@Value("${from}")
	private String from;
	
	@Value("${team}")	
	private String team;

	@Value("${age}")
	private Integer age;

	public String getFisrtName() {
		return fisrtName;
	}

	public void setFisrtName(String fisrtName) {
		this.fisrtName = fisrtName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public String getFrom() {
		return from;
	}

	public void setFrom(String from) {
		this.from = from;
	}

	public String getTeam() {
		return team;
	}

	public void setTeam(String team) {
		this.team = team;
	}

	public Integer getAge() {
		return age;
	}

	public void setAge(Integer age) {
		this.age = age;
	}
	
	@PostConstruct
	public void init() {
		System.out.println("I am init methood");
	}
	
	@PreDestroy
	public void deletAll() {
		System.out.println("I am destroy method");
	}

	@Override
	public String toString() {
		return "kJadhav [fisrtName=" + fisrtName + ", lastName=" + lastName + ", from=" + from + ", team=" + team
				+ ", age=" + age + "]";
	}
	
	

}
