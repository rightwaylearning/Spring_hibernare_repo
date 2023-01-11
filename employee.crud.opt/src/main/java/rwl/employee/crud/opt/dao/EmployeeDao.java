package rwl.employee.crud.opt.dao;

import java.util.List;
import rwl.employee.crud.opt.entity.Employee;

public interface EmployeeDao {
	public List<Employee> getEmployee();
	public Employee getEmployee(Integer employeeId);
	public Integer saveEmployee(Employee employee);
	public Employee updateEmployee(Employee employee);
	public Integer deleteEmployee(Integer employeeId);
}
