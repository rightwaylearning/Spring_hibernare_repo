package object.state.check.example;

import org.hibernate.Session;
import org.hibernate.Transaction;

import pojo.classes.City;
import utility.classses.GetSessionFactroyObjects;

public class Controller {

	public static void main(String[] args) {
		
		Session session = GetSessionFactroyObjects.getSessionFactory().openSession();
		City c = session.get(City.class, 101);
		Transaction tx = session.beginTransaction();
		 c.setCityName("Shivaji Nagar");
		tx.commit();
		session.close();
		
	}
}
