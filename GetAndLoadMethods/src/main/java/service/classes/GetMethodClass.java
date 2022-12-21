package service.classes;

import org.hibernate.Session;
import utility.classses.GetSessionFactroyObjects;
import pojo.classes.City;

public class GetMethodClass {


	public City getCityObject(Integer id) {
		Session session = GetSessionFactroyObjects.getSessionFactory().openSession();
		City city = session.get(City.class, id);
		return city;
	}
}
