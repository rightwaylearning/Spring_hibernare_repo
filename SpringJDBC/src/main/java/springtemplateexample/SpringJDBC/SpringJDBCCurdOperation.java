package springtemplateexample.SpringJDBC;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

@Repository
public class SpringJDBCCurdOperation {

	@Autowired
	JdbcTemplate jdbcTemplate;

	public JdbcTemplate getJdbcTemplate() {
		return jdbcTemplate;
	}

	public void setJdbcTemplate(JdbcTemplate jdbcTemplate) {
		this.jdbcTemplate = jdbcTemplate;
	}
	
	public List<Employee> getAllEmployeeDetails(){
		return jdbcTemplate.query("select * from employees", new BeanPropertyRowMapper<Employee>(Employee.class));
	}
	
	public Employee getSingleObject(Integer id) {
		return jdbcTemplate.queryForObject("select * from employees where employeeNumber = ? ", new BeanPropertyRowMapper<Employee>(Employee.class),id);
	}
	
	public Integer updateEmployee(String lastName, Integer id) {
		return jdbcTemplate.update("update employees set lastName = ? where employeeNumber = ?",lastName, id);
	}
	
}
