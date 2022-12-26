package states.of.hibernate.objects;

import org.hibernate.Session;
import org.hibernate.Transaction;

import pojo.classes.City;
import utility.classses.GetSessionFactroyObjects;

public class Controller {

	public static void main(String[] args) {

		City c = new City();
		c.setCityName("amravati");
		c.setCityState("MH");
		c.setCityPin(98765);

		Session session = GetSessionFactroyObjects.getSessionFactory().openSession();
		Transaction tx = session.beginTransaction();
		session.save(c);  
		
		c.setCityPin(898989);
		c.setCityName("Amravati");
		
		tx.commit();
		
		session.evict(c); 
		c.setCityName("Amritsar");
		session.close();
		c.setCityPin(88888);
		// here cache is close/destroy.
		
	}
}


// and >> by calling session.close() or session.clear() or session.evict(single object)

// Note:- 


