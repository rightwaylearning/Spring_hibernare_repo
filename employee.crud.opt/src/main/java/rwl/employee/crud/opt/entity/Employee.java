package rwl.employee.crud.opt.entity;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Column;
import javax.persistence.Table;

@Entity
@Table(name="employee")
public class Employee {

	@Id
	@Column(name="employee_id")
	private Integer employeeNumber;
	
	@Column(name="first_name")
	private String firstName;
	
	@Column(name="last_name")
	private String lastName;
	
	@Column(name="office_name")
	private String officeName;
	
	private Double salary;
	
	public Employee() {}
	
	
	public Employee(Integer employeeNumber, String firstName, String lastName, String officeName, Double salary) {
		super();
		this.employeeNumber = employeeNumber;
		this.firstName = firstName;
		this.lastName = lastName;
		this.officeName = officeName;
		this.salary = salary;
	}



	public Integer getEmployeeNumber() {
		return employeeNumber;
	}

	public void setEmployeeNumber(Integer employeeNumber) {
		this.employeeNumber = employeeNumber;
	}

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

	public String getOfficeName() {
		return officeName;
	}

	public void setOfficeName(String officeName) {
		this.officeName = officeName;
	}

	public Double getSalary() {
		return salary;
	}

	public void setSalary(Double salary) {
		this.salary = salary;
	}


	@Override
	public String toString() {
		return "Employee [employeeNumber=" + employeeNumber + ", firstName=" + firstName + ", lastName=" + lastName
				+ ", officeName=" + officeName + ", salary=" + salary + "]";
	}
	
	
}
