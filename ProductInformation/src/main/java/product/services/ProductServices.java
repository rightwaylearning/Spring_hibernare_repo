package product.services;

import java.util.List;

import product.dao.Product;

public interface ProductServices {

	public Product read(Integer productId);
	public Integer insert(Product product);
	public boolean update(Product product);
	public boolean delete(Integer productId);
	public List<Product> getAllproduct();
}
