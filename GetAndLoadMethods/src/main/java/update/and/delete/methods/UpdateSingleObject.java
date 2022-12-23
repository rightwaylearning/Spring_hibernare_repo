package update.and.delete.methods;

import org.hibernate.Session;
import org.hibernate.Transaction;

import pojo.classes.City;
import utility.classses.GetSessionFactroyObjects;

public class UpdateSingleObject {

	public static void main(String[] args) {
		
		// there are 2 ways to update object
		// 1] create object set all property but id property should matched & 
		//other property we have to set all & change which you want
		// try to avoid this way
//		Session session = GetSessionFactroyObjects.getSessionFactory().openSession();
//		
//		City c = new City();
//		c.setCityCode(101);
//		c.setCityName("PUNE");
//		c.setCityState("Maharashtra");
//		c.setCityPin(412356);
//		
//		Transaction tx = session.beginTransaction();
//		session.update(c);
//		tx.commit();
//		
//		session.close();
		
		// 2] first read full object form database & update
		// try to use this one
       Session session = GetSessionFactroyObjects.getSessionFactory().openSession();
		
		City c = session.get(City.class, 101);
		if(c != null) {
			c.setCityName("Gultekdi");
			Transaction tx = session.beginTransaction();
			session.update(c);
			tx.commit();
		}
		session.close();
		
		
		
		
	}
}
