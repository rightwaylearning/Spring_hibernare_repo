package service.classes;

import org.hibernate.Session;
import utility.classses.GetSessionFactroyObjects;
import pojo.classes.City;


public class LoadMethodClass {

	
	public City loadCityObject(Integer id) {
		Session session = GetSessionFactroyObjects.getSessionFactory().openSession();
		City city = session.load(City.class, id);
		return city;
	}
}
