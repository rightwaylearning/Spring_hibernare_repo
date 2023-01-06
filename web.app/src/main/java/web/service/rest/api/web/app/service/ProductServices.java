package web.service.rest.api.web.app.service;

import java.util.List;

import web.service.rest.api.web.app.entity.Product;

public interface ProductServices {
	public Product getProduct(Integer productId);
	public List<Product> getProducts();
	public Integer saveProduct(Product product);
	public Integer updateProduct(Product product);
	public Integer deleteProduct(Integer productId);
}
