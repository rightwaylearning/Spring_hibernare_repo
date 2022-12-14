package employee.info;

import java.io.Serializable;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class Controller {

	public static void main(String[] args) {
			
		try {
			Configuration c = new Configuration();
			c.configure("Configuration.cfg.xml");
			
			// connection factory
			SessionFactory sf = c.buildSessionFactory();
		Session session = sf.openSession();
		
		Student s = new Student();
		s.setId(112);
		s.setFirstName("test");s.setLastName("lmn");
		s.setAge(23);s.setGender("male");
		Transaction t = session.beginTransaction();
		Serializable s1 = session.save(s);
		System.out.println(s1);
		t.commit();
		
		session.close();
		}catch (Exception e) {
			System.out.println(e);
		}
				
	}
	
	private static SessionFactory getSessionfactroy() {
		// load
		
		return null;
	}
}
