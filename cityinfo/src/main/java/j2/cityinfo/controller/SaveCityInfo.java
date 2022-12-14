package j2.cityinfo.controller;

import java.io.Serializable;

import org.hibernate.Session;
import org.hibernate.Transaction;

import j1.entity.cityinfo.City;
import session.factory.generator.GenerateSessionFactoryInstance;

public class SaveCityInfo {

	public static void main(String[] args) {
		
		Session session = GenerateSessionFactoryInstance.getFactory().openSession();
		
//		City city = (City)session.get(City.class, 1);
//		System.out.println(city.getCityName());
//		System.out.println(city.getCityState());
		
		City c1= new City();
		c1.setCityCode(4);c1.setCityName("Surat");c1.setCityState("Gujrat");c1.setCityPin(456789);
		
		Transaction tx =session.beginTransaction();
		Serializable id = session.save(c1);
		tx.commit();
			
		System.out.println(id);
		
		session.close();
	}
}
