package product.dao;

import java.util.List;

import product.dao.Product;

public interface ProductDao {
	public Product read(Integer productId);
	public Integer insert(Product product);
	public void update(Product product);
	public void delete(Integer productId);
	public List<Product> getAllproduct();
}
