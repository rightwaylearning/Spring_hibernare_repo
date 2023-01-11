package rwl.employee.crud.opt.rest.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import rwl.employee.crud.opt.entity.Employee;
import rwl.employee.crud.opt.service.EmployeeServicesImpl;

@RestController
@RequestMapping("/app")
public class EmployeeRestController {

	@Autowired
	public EmployeeServicesImpl employeeServicesImpl;

	// http://localhost:8080/app/employee
	@GetMapping(path = "/employee", produces = MediaType.APPLICATION_JSON_VALUE)
	public List<Employee> getEmployeeList() {
		return employeeServicesImpl.getEmployee();
	}

	// http://localhost:8080/app/employee/12
	@GetMapping(path = "/employee/{employeeId}", produces = MediaType.APPLICATION_JSON_VALUE)
	public Employee getEmployee(@PathVariable Integer employeeId) {
		return employeeServicesImpl.getEmployee(employeeId);
	}

	// http://localhost:8080/app/employee
	@PostMapping(path = "/employee", produces = MediaType.APPLICATION_JSON_VALUE, consumes = MediaType.APPLICATION_JSON_VALUE)
	public Employee getEmployee(@RequestBody Employee employee) {
		Integer i = employeeServicesImpl.saveEmployee(employee);
		return employee;
	}

//  http://localhost:8080/app/employee
	@PutMapping(path = "/employee", produces = MediaType.APPLICATION_JSON_VALUE, consumes = MediaType.APPLICATION_JSON_VALUE)
	public Employee updateEmployee(@RequestBody Employee employee) {
		return employeeServicesImpl.updateEmployee(employee);
	}

	// http://localhost:8080/app/employee/12
	@DeleteMapping(path = "/employee/{employeeId}")
	public Integer deleteEmployee(@PathVariable Integer employeeId) {
		return employeeServicesImpl.deleteEmployee(employeeId);
	}

}
