package employee.info;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class Controller {

	public static void main(String[] args) {
			
		// give me one connection
		
		Session session = getSessionfactroy().openSession();
		
		Employees e = (Employees)session.get(Employees.class, 1088);
		
				
		System.out.println(e);
		
		session.close();

				
	}
	
	private static SessionFactory getSessionfactroy() {
		// load
		Configuration c = new Configuration();
		c.configure("Configuration.cfg.xml");
		
		// connection factory
		SessionFactory sf = c.buildSessionFactory();
		return sf;
	}
}
