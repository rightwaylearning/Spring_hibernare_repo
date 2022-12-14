package hibenate.fun;

public class Employees {

	private Integer employeeNumber;
	private String lastName;
	private String firstName;
	private String extenstion;
	private String email;
	private String officeCode;
	private Integer reportTo;
	private String jobTitle;
	
	public Employees() {}

	public Employees(Integer employeeNumber, String lastName, String firstName, String extenstion, String email,
			String officeCode, Integer reportTo, String jobTitle) {
		super();
		this.employeeNumber = employeeNumber;
		this.lastName = lastName;
		this.firstName = firstName;
		this.extenstion = extenstion;
		this.email = email;
		this.officeCode = officeCode;
		this.reportTo = reportTo;
		this.jobTitle = jobTitle;
	}

	public Integer getEmployeeNumber() {
		return employeeNumber;
	}

	public void setEmployeeNumber(Integer employeeNumber) {
		this.employeeNumber = employeeNumber;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getExtenstion() {
		return extenstion;
	}

	public void setExtenstion(String extenstion) {
		this.extenstion = extenstion;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getOfficeCode() {
		return officeCode;
	}

	public void setOfficeCode(String officeCode) {
		this.officeCode = officeCode;
	}

	public Integer getReportTo() {
		return reportTo;
	}

	public void setReportTo(Integer reportTo) {
		this.reportTo = reportTo;
	}

	public String getJobTitle() {
		return jobTitle;
	}

	public void setJobTitle(String jobTitle) {
		this.jobTitle = jobTitle;
	}

	@Override
	public String toString() {
		return "Employees [employeeNumber=" + employeeNumber + ", lastName=" + lastName + ", firstName=" + firstName
				+ ", extenstion=" + extenstion + ", email=" + email + ", officeCode=" + officeCode + ", reportTo="
				+ reportTo + ", jobTitle=" + jobTitle + "]";
	}
}
