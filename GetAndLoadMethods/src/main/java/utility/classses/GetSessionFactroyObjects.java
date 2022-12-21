package utility.classses;


import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class GetSessionFactroyObjects {

	private static SessionFactory sessionFactory;
	
	static{
		Configuration config = new Configuration();
		config.configure("hibernate.cfg.xml");
		sessionFactory = config.buildSessionFactory();
		System.out.println(">>>>>>>>>> SessionFactroy object creation done>>>>>");
	}
	
	public static SessionFactory getSessionFactory() {
		return sessionFactory;
	}
}
