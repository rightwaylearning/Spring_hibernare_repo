package entry.point;

import java.util.List;

import dao.operations.ProductDao;
import dao.operations.ProductDaoCriteriaAPIImpl;
import model.classes.Product;

public class CriteriaController {

	static ProductDaoCriteriaAPIImpl dao = new ProductDaoCriteriaAPIImpl();
	
	public static void main(String[] args) {
		
		//List<Product> list = dao.getAllProductInfo();
		// List<Product> list = dao.getAllProductInfo(1000.00);
//		List<Product> list = dao.multipleFilters(1000.00,"LG");
//		for (Product product : list) {
//			System.out.println(product);
//		}
		
	//	List<Object[]> list = dao.getFewColumnInfo();
//		List<Object[]> list = dao.sunOfAllproductPrice();
//		
//		for (Object[] objects : list) {
//			System.out.println(objects[0] +" "+ objects[1] );
//		}
		
		// pagination
		
		List<Product> list = dao.pagination(8,4);
		for (Product product : list) {
			System.out.println(product);
		}	
	}
}
