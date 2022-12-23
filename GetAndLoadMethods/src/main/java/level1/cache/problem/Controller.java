package level1.cache.problem;

import org.hibernate.Session;

import pojo.classes.City;
import utility.classses.GetSessionFactroyObjects;

public class Controller {

	public static void main(String[] args) throws Exception{
		
		Session s1 =GetSessionFactroyObjects.getSessionFactory().openSession();
		City c1 = s1.get(City.class, 101);
		System.out.println(c1);
		System.out.println("--------------------------------------");
	//	Thread.currentThread().sleep(20000);
		//s1.refresh(c1); // here one more select query generated because of refresh method read object from DB not from cache.
		//s1.evict(c1); // here evict method delete only c1 object from cache
		//s1.clear(); // here clear() method remove/delete all object from cache.
		City c2 = s1.get(City.class, 101);
		System.out.println(c2);
	}
}
