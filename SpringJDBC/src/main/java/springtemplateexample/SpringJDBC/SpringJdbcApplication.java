package springtemplateexample.SpringJDBC;

import java.util.List;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.ComponentScan;

import pack1.test.Student;

@SpringBootApplication
@ComponentScan({"springtemplateexample.SpringJDBC","pack1.test"})
public class SpringJdbcApplication {

	public static void main(String[] args) {
		ApplicationContext ctx = SpringApplication.run(SpringJdbcApplication.class, args);
		
		SpringJDBCCurdOperation obj = ctx.getBean(SpringJDBCCurdOperation.class);
		
//		List<Employee> data = obj.getAllEmployeeDetails();
//		
//		for (Employee e : data) {
//			System.out.println(e);
//		}
		
		Employee e1 = obj.getSingleObject(1056);
		System.out.println(e1);
		
	//	System.out.println(obj.updateEmployee("json",1056));
		
		Student s = ctx.getBean(Student.class);
		System.out.println(s.getMessage());
	}

}
