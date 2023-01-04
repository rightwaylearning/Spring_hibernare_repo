package product.services;

import java.util.List;

import dao.operations.ProductDao;
import dao.operations.ProductDaoImpl;
import model.classes.Product;
import model.classes.Temp;

public class ProductServiceImpl implements ProductService {
	
	private ProductDao productDao = null;
	
	public ProductServiceImpl() {
		this.productDao = new ProductDaoImpl();
	}

	public List<Product> getAllProductInfo() {
		return this.productDao.getAllProductInfo();
	}

	public List<Product> getAllProductInfo(Double lessThanPrice) {
		// TODO Auto-generated method stub
		return null;
	}

	public List<Object[]> getFewColumnInfo() {
		return this.productDao.getFewColumnInfo();
	}

	public List<String> getAllProductsName() {
		// TODO Auto-generated method stub
		return null;
	}

	public Integer updateAllProductPrice(Integer percentage) {
		double calculatePercentage = (percentage/100.0);
		System.out.println("calculatePercentage = "+ calculatePercentage );
		return this.productDao.updateAllProductPrice(calculatePercentage);
	}

	public Integer deleteProduct(Integer productId) {
		// TODO Auto-generated method stub
		return null;
	}

	public Integer insertNewProduct(Temp temp) {
		// delete all record from temp table
		this.productDao.deleteTempRecords();
		this.productDao.saveRecordIntoTemp(temp);
		// insert 1 record into temp
		return this.productDao.insertNewProduct();
	}

}
