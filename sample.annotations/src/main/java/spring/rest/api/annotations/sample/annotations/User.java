package spring.rest.api.annotations.sample.annotations;

public class User {

	private Integer userId;
	private String firstname;
	private String lastName;
	private String userName;
	
	public User() {}

	public User(Integer userId, String firstname, String lastName, String userName) {
		super();
		this.userId = userId;
		this.firstname = firstname;
		this.lastName = lastName;
		this.userName = userName;
	}

	public Integer getUserId() {
		return userId;
	}

	public void setUserId(Integer userId) {
		this.userId = userId;
	}

	public String getFirstname() {
		return firstname;
	}

	public void setFirstname(String firstname) {
		this.firstname = firstname;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public String getUserName() {
		return userName;
	}

	public void setUserName(String userName) {
		this.userName = userName;
	}

	@Override
	public String toString() {
		return "User [userId=" + userId + ", firstname=" + firstname + ", lastName=" + lastName + ", userName="
				+ userName + "]";
	}
}
