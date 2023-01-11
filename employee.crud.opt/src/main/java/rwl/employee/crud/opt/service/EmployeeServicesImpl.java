package rwl.employee.crud.opt.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import rwl.employee.crud.opt.dao.EmployeeDaoImpl;
import rwl.employee.crud.opt.entity.Employee;

@Service
public class EmployeeServicesImpl implements EmployeeServices {

	@Autowired
	EmployeeDaoImpl employeeDaoImpl;
	
	@Override
	public List<Employee> getEmployee() {
		return employeeDaoImpl.getEmployee();
	}

	@Override
	public Employee getEmployee(Integer employeeId) {
		return employeeDaoImpl.getEmployee(employeeId);
	}

	@Override
	public Integer saveEmployee(Employee employee) {
		return employeeDaoImpl.saveEmployee(employee);
	}

	@Override
	public Employee updateEmployee(Employee employee) {
		return employeeDaoImpl.updateEmployee(employee);
	}

	@Override
	public Integer deleteEmployee(Integer employeeId) {
		return employeeDaoImpl.deleteEmployee(employeeId);
	}

}
