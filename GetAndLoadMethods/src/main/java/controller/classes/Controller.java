package controller.classes;

import service.classes.GetMethodClass;
import service.classes.LoadMethodClass;
import pojo.classes.City;

public class Controller {
	
	

	public static void main(String[] args) {
	
//		GetMethodClass getObj = new GetMethodClass();
//		City c =getObj.getCityObject(102);
//		System.out.println(c);
		
		LoadMethodClass loadObj = new LoadMethodClass();
		City c = loadObj.loadCityObject(102);
		System.out.println(c.getCityCode());
		System.out.println(">>>>>>>>>>>>>>>>>>>>>>>>>>");
		System.out.println(c.getCityName());
		
		
	}
}
