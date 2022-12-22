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
		//s1.refresh(c1); // here one more time select query run
		s1.evict(c1);
		City c2 = s1.get(City.class, 101);
		System.out.println(c2);
	}
}
