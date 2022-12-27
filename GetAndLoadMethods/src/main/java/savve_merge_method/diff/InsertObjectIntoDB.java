package savve_merge_method.diff;

import java.io.Serializable;

import org.hibernate.Session;
import org.hibernate.Transaction;

import pojo.classes.City;
import utility.classses.GetSessionFactroyObjects;

public class InsertObjectIntoDB {
 
	public static void main(String[] args) {
		
		Session session = GetSessionFactroyObjects.getSessionFactory().openSession();
		
		City c= new City();
		c.setCityName("Surat");c.setCityState("GJ");
		c.setCityPin(456789);
		Transaction tx =session.beginTransaction();
		Serializable id = session.save(c);
		System.out.println(">>>>>>> "+ id);
		tx.commit();
		System.out.println("==============================");
		City c1= new City();
		c1.setCityName("gandhinagar");c1.setCityState("GJ");
		c1.setCityPin(496789);
		Transaction tx1 =session.beginTransaction();
		session.persist(c1);
		tx1.commit();
		
	}
}
