package dao.operations;

import java.util.List;

import model.classes.Product;
import model.classes.Temp;

public interface ProductDao {

	List<Product> getAllProductInfo();
	List<Product> getAllProductInfo(Double lessThanPrice);
	List<Object[]> getFewColumnInfo();
	List<String> getAllProductsName();
	Integer updateAllProductPrice(double discount);
	Integer deleteProduct(Integer productId);
	Integer insertNewProduct();
	Integer deleteTempRecords();
	Integer saveRecordIntoTemp(Temp temp);
}
