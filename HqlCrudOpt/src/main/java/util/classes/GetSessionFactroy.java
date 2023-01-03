package util.classes;

import org.hibernate.SessionFactory;
import org.hibernate.boot.registry.StandardServiceRegistryBuilder;
import org.hibernate.cfg.Configuration;
import org.hibernate.service.ServiceRegistry;

public class GetSessionFactroy implements Cloneable{

	private static SessionFactory sessionFactory = null;
	
	private GetSessionFactroy() {}
	
	public static synchronized SessionFactory getSessionFactroyInstance() {
		if(sessionFactory == null) {
			Configuration configuration = new Configuration();
			configuration.configure("hibernate.cfg.xml");
			sessionFactory = configuration.buildSessionFactory(); 
		}
			return sessionFactory;
	}
   
	@Override
	protected Object clone() throws CloneNotSupportedException {
		return new Exception();
	}
}
