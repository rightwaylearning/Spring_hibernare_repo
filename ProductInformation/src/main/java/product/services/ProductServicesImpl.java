package product.services;

import product.dao.Product;
import product.dao.ProductDao;
import product.dao.ProductUtil;

public class ProductServicesImpl implements ProductServices {
	
	private ProductDao productDao;
	
	public ProductServicesImpl() {
		productDao = ProductUtil.getDaoImplInstance();
	}

	public Product read(Integer productId) {
		return productDao.read(productId);
	}

	public Integer insert(Product product) {
		return productDao.insert(product);
	}

	public boolean update(Product product) {
		productDao.update(product);
		return true;
	}

	public boolean delete(Integer productId) {
		productDao.delete(productId);
		return true;
	}

}
