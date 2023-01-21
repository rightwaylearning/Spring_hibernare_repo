package rwl.employee.crud.opt.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import rwl.employee.crud.opt.dao.EmployeeDaoImpl;
import rwl.employee.crud.opt.entity.Employee;
import rwl.employee.crud.opt.exception.handlers.EmployeeNotExist;

@Service
public class EmployeeServicesImpl implements EmployeeServices {

	@Autowired
	EmployeeDaoImpl employeeDaoImpl;
	
	@Override
	public List<Employee> getEmployee() {
		
//		List<Employee> emp = null;
//		emp.add(null);
		
		return employeeDaoImpl.getEmployee();
	}

	@Override
	public Employee getEmployee(Integer employeeId) {
		Employee employee =  employeeDaoImpl.getEmployee(employeeId);
		if(employee == null) {
		 throw new EmployeeNotExist();	
		}
		return employee;
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
