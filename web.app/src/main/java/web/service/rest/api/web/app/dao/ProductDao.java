package web.service.rest.api.web.app.dao;

import java.util.List;

import web.service.rest.api.web.app.entity.Product;

public interface ProductDao {
	public List<Object[]> getProduct(Integer productId);
	public List<Object[]> getProducts();
	public Integer saveProduct(Product product);
	public Integer updateProduct(Product product);
	public Integer deleteProduct(Integer productId);
}
