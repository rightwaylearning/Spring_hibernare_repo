package dao.operations;

import java.util.List;

import model.classes.Product;

public interface ProductDao {

	List<Product> getAllProductInfo();
	List<Product> getAllProductInfo(Double lessThanPrice);
	List<Object[]> getFewColumnInfo();
	List<String> getAllProductsName();
	Integer updateAllProductPrice(Integer discount);
	Integer deleteProduct(Integer productId);
	Integer insertNewProduct(Product product);
}
