package web.service.rest.api.web.app.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import web.service.rest.api.web.app.dao.ProductdaoImpl;
import web.service.rest.api.web.app.entity.Product;

@Service
public class ProductServicesImpl implements ProductServices {
	
	@Autowired
	ProductdaoImpl productdaoImpl;

	@Override
	public Product getProduct(Integer productId) {
		List<Object[]> productList = productdaoImpl.getProduct(productId);
		System.out.println("size == "+productList.size());
		if(productList != null || productList.size() > 0) {
		Product product= new Product();
		
		Object[] singleProduct = productList.get(0);
		
		product.setProductId((Integer)singleProduct[0]);
		product.setProductName((String)singleProduct[1]);
		product.setProductPrice((Double)singleProduct[2]);
		product.setProductType((String)singleProduct[3]);
		product.setProductBrand((String)singleProduct[4]);
		return product;
		}
		return null;
	}

	@Override
	public List<Product> getProducts() {
		List<Object[]> list = productdaoImpl.getProducts();
		
		List<Product> arrayList = new ArrayList<>();

		for(Object[] singleProduct :list) {
			
			Product product = new Product();
			product.setProductId((Integer)singleProduct[0]);
			product.setProductName((String)singleProduct[1]);
			product.setProductPrice((Double)singleProduct[2]);
			product.setProductType((String)singleProduct[3]);
			product.setProductBrand((String)singleProduct[4]);
			
			arrayList.add(product);
		}
		
		return arrayList;
	}

	@Override
	public Integer saveProduct(Product product) {
		
		return productdaoImpl.saveProduct(product);
	}

	@Override
	public Integer updateProduct(Product product) {
		return productdaoImpl.updateProduct(product);
	}

	@Override
	public Integer deleteProduct(Integer productId) {
		return productdaoImpl.deleteProduct(productId);
	}

}
