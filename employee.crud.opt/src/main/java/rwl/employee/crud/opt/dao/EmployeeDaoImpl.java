package rwl.employee.crud.opt.dao;

import java.util.List;
import rwl.employee.crud.opt.entity.Employee;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;

public class EmployeeDaoImpl implements EmployeeDao {
    
	@Autowired
	SessionFactory sessionFactory;
	
	@Override
	public List<Employee> getEmployee() {
        // Criteria api
		return null;
	}

	@Override
	public Employee getEmployee(Integer employeeId) {
		// TODO Auto-generated method stub
		// criteria api
		return null;
	}

	@Override
	public Integer saveEmployee(Employee employee) {
		// TODO Auto-generated method stub
		// save method of Session
		return null;
	}

	@Override
	public Integer updateEmployee(Employee employee) {
		// TODO Auto-generated method stub
		// HQL
		return null;
	}

	@Override
	public Integer deleteEmployee(Integer employeeId) {
		// TODO Auto-generated method stub
		// delete method of session 
		return null;
	}

}
