package save.with.auto.increment;

import org.hibernate.Session;
import org.hibernate.Transaction;

import pojo.classes.City;
import utility.classses.GetSessionFactroyObjects;

public class SaveSingleObject {

	public static void main(String[] args) {
		
		   Session session = GetSessionFactroyObjects.getSessionFactory().openSession();
		
		    City c = new City();
		    c.setCityName("sambhaji Nagar");
		    c.setCityState("MH");
		    c.setCityPin(234567);
			Transaction tx = session.beginTransaction();
			session.save(c);
			tx.commit();
			session.close();
	}
}
