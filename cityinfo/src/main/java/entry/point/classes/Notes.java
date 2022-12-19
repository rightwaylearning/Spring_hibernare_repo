package entry.point.classes;

import java.io.Serializable;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import j1.entity.cityinfo.City;

public class Notes {

	public static void main(String[] args) {
		
		// step 1]
	   Configuration c = new Configuration(); // Configuration is class not a interface 
	   c.configure("configuration.cfg.xml");
	   // above 2 line , 1] created Configuration object & 2] configure method
	   //load all data which is provided inside xml as input & store into variable 
	   
	   // step 2]	   
	   SessionFactory sessionFactory = c.buildSessionFactory();
	   // here SessionFactory is interface  & buildSessionFactory() method is instance factory method 
	   // available inside Configuration class & this method return SessionFactory impl class instance 
	   // session means connection & session factory means connection factory , means lot of connections objects
	   
	   // step 3]
	    Session session = sessionFactory.openSession();
	    // here session is interface & we have no idea about his impl class  , so with help of sessionfactory object 
	    // we are going to read Session object
	    
	    // step 4] // actual operation
	    // save, get, update, read. delete, load, merge 
	    // all above operations done on session object .
	    //================================================================================
	      // for read operation no need to do Transaction mang. but for other operation like save,
	    // update & delete required Transaction mang.
	    
	      // read object on basis of id property 
	    
	        City c1 =session.get(City.class, 1); 
	        City c2 =session.load(City.class, 2); 
	    
	    // now we are doing save operation , but here we need transaction mang.
	        
	         City c3 = new City();
	         c3.setCityCode(123);c3.setCityName("Madras");c3.setCityState("Tamilnadu");
	         c3.setCityPin(123456);
	         
	         Transaction tx = session.beginTransaction();  
	           // save, update, delete ....
	          Serializable  id = session.save(c3);
	          tx.commit();
	    //==================================================================================  
	    
	    // step 5]
	    // first close session
	    session.close();
	    
	    // step 6] session factory  close
	    sessionFactory.close();
	   
	}
}
