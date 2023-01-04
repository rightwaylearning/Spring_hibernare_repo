package product.services;

import java.util.List;

import model.classes.Product;
import model.classes.Temp;

public interface ProductService {

	List<Product> getAllProductInfo();
	List<Product> getAllProductInfo(Double lessThanPrice);
	List<Object[]> getFewColumnInfo();
	List<String> getAllProductsName();
	Integer updateAllProductPrice(Integer percentage);
	Integer deleteProduct(Integer productId);
	Integer insertNewProduct(Temp temp);
}
