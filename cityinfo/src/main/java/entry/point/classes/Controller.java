package entry.point.classes;

import java.io.Serializable;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import j1.entity.cityinfo.City;

public class Controller {

	public static void main(String[] args) {
		
		Configuration configuration = new Configuration();
		configuration.configure("configuration.cfg.xml");
		
		SessionFactory sessionFactory = configuration.buildSessionFactory();
		
		Session   session = sessionFactory.openSession();
		
		// read operation , trx is not required
		//City city = session.get(City.class, 2);
		//System.out.println(city);
		
		// save 
//		City c1 = new City();
//		c1.setCityCode(12345); c1.setCityName("Madras");c1.setCityState("Tamilnadu");
//		c1.setCityPin(12345);
//       here tx required
//		Transaction tx = session.beginTransaction();
//		Serializable id= session.save(c1);
//		System.out.println(id);
//		tx.commit();
		
		
		// delete opt required tx mang.
//		City c2 = new City(); c2.setCityCode(1);
//		Transaction tx = session.beginTransaction();
//		session.delete(c2);
//		tx.commit();
		
		
//		// update
//		City c1 = new City();
//		c1.setCityCode(3); c1.setCityName("gandhinagar");c1.setCityState("Gujrat");
//		c1.setCityPin(566777);
//		
//      //  here tx required
//		Transaction tx = session.beginTransaction();
//		session.update(c1);
//		tx.commit();
		
		
		session.close();
		sessionFactory.close();
	}
}
