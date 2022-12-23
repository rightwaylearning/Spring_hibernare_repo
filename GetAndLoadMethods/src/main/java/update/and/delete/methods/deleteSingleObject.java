package update.and.delete.methods;

import org.hibernate.Session;
import org.hibernate.Transaction;

import pojo.classes.City;
import utility.classses.GetSessionFactroyObjects;

public class deleteSingleObject {

	 public static void main(String[] args) {
		

			// 1] first way create empty object set id property & pass to delete
			// method
//		    Session session = GetSessionFactroyObjects.getSessionFactory().openSession();
//			City c = new City();
//			c.setCityCode(101);
//			Transaction tx = session.beginTransaction();
//			session.delete(c);
//			tx.commit();
		 
		  // 2] first read that object from DB if it's exist then only call delete method
		 
		    Session session = GetSessionFactroyObjects.getSessionFactory().openSession();
			City c = session.get(City.class, 102);
			if(c != null) {
			Transaction tx = session.beginTransaction();
			session.delete(c);
			tx.commit();
			}
			session.close();
	}
}
