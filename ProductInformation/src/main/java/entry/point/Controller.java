package entry.point;

import java.util.List;

import product.dao.Product;
import product.services.ProductServices;
import product.services.ProductServicesImpl;

public class Controller {

	public static void main(String[] args) {
		
		ProductServices service = new ProductServicesImpl();
		// insert
//		Product p = new Product("laptop", 93000.00, "electronic", "apple");
//		Integer i = service.insert(p);
//		System.out.println(i);
		
		// read
		
		Product p  = service.read(1);
		System.out.println(p);
		
		// update 
		if(p != null) {
			p.setProductPrice(35000.00);
			boolean b1 = service.update(p);
			System.out.println("is object id 1 is updated = "+ b1);
		}
		
		// delete
		
		boolean b = service.delete(2);
		System.out.println("is product id 2 deleted = " + b);
		
		//------------------------- HQL language
		
		List<Product>  allProduct = service.getAllproduct();
		
		for (Product product : allProduct) {
			System.out.println(product);
		}
	}
}
