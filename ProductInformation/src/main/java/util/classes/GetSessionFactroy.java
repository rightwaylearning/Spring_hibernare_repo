package util.classes;

import org.hibernate.SessionFactory;
import org.hibernate.boot.registry.StandardServiceRegistryBuilder;
import org.hibernate.cfg.Configuration;
import org.hibernate.service.ServiceRegistry;

public class GetSessionFactroy implements Cloneable{

	private static SessionFactory sessionFactory = null;
	
	private GetSessionFactroy() {}
	
	public static SessionFactory getSessionFactroyInstance() {
	
		if(sessionFactory == null) {
			
			Configuration configuration = new Configuration();
			configuration.configure("hibernate.cfg.xml");
		    
			// hibernate 4.x
			
//			StandardServiceRegistryBuilder ssrb = new StandardServiceRegistryBuilder();
//			ssrb.applySettings(configuration.getProperties());
//			ServiceRegistry serviceRegistry = ssrb.build();
			
			ServiceRegistry serviceRegistry = new StandardServiceRegistryBuilder().applySettings(configuration.getProperties()).build();
			sessionFactory = configuration.buildSessionFactory(); // serviceRegistry
		}
			return sessionFactory;
		
	}
   
	@Override
	protected Object clone() throws CloneNotSupportedException {
		return new Exception();
	}
}
