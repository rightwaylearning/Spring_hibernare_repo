package entry.point;

import java.util.List;

import model.classes.Product;
import product.services.ProductService;
import product.services.ProductServiceImpl;

public class Controller {

	private static ProductService service = new ProductServiceImpl();
	
	public static void main(String[] args) {
		
//		List<Product> list = service.getAllProductInfo();
//		
//		for (Product product : list) {
//			System.out.println(product);
//		}
		
//		List<Object[]> list = service.getFewColumnInfo();
//		
//		for (Object[] objects : list) {
//			System.out.println(objects[0] +" : "+objects[1]);
//		}
		
		Integer i = service.updateAllProductPrice(10);
		System.out.println(i);
				
	}
}
