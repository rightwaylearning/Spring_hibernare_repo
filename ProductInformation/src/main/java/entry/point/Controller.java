package entry.point;

import product.dao.Product;
import product.services.ProductServices;
import product.services.ProductServicesImpl;

public class Controller {

	public static void main(String[] args) {
		
		ProductServices service = new ProductServicesImpl();
		
		Product p = new Product("TV", 23000.00, "electronic", "LG");
		Integer i = service.insert(p);
		System.out.println(i);
	}
}
