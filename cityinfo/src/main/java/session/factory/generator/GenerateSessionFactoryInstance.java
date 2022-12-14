package session.factory.generator;

import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class GenerateSessionFactoryInstance {

	public static SessionFactory sf =null;
	
	static {
		Configuration cfg = new Configuration();
		cfg.configure("configuration.cfg.xml");
		sf = cfg.buildSessionFactory();
	}
	
	public static SessionFactory getFactory() {
		return sf;
	}
	
	
}
