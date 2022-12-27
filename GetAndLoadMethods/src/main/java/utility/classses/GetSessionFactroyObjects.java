package utility.classses;


import org.hibernate.SessionFactory;
import org.hibernate.boot.registry.StandardServiceRegistryBuilder;
import org.hibernate.cfg.Configuration;
import org.hibernate.service.ServiceRegistry;

public class GetSessionFactroyObjects {

	private static SessionFactory sessionFactory;
	
	static{
		// here sessionFactory object creation using hibernate 3.x
		Configuration config = new Configuration();
		config.configure("hibernate.cfg.xml");
		sessionFactory = config.buildSessionFactory();
	}
	
	public static SessionFactory getSessionFactory() {
		return sessionFactory;
	}
	
	// SessionFactroy object creation using hibernate 4.x
	void createSessionFactoryInstance() {
		
		Configuration config = new Configuration();
		config.configure("hibernate.cfg.xml");
		
		StandardServiceRegistryBuilder ssrb = new StandardServiceRegistryBuilder();
		ssrb.applySettings(config.getProperties());
		
		ServiceRegistry serviceRegistry = ssrb.build();
		
		SessionFactory factory = config.buildSessionFactory(serviceRegistry);
		
	}
}
