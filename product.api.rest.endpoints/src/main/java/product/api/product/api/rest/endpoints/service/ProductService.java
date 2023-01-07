package product.api.product.api.rest.endpoints.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Service;

@Service
public class ProductService {
	
	private List<Product> list;
	
	public ProductService() {
		this.list = new ArrayList<>();
	    this.list.add(new Product(1, "Mobile", 11234.50, "MI"));
	    this.list.add(new Product(2, "TV", 31234.50, "LG"));
	    this.list.add(new Product(3, "Laptop", 91204.50, "Apple"));
	    this.list.add(new Product(4, "Computer", 40234.50, "HP"));
	}
	
	public List<Product> getAllProduct(){
		return this.list;
	}

	
	public Product getProduct(Integer productId) {
		
		for (Product product : this.list) {
			if(product.getProductId().equals(productId)) {
				return product;
			}
		}
		return null;
	}
	
	public Product insertProduct(Product product) {
		this.list.add(product);
        return product;		
	}
	
	public Product updateProduct(Product updatedproduct) {
		
		for (Product product : list) {
			if(product.getProductId().equals(updatedproduct.getProductId())) {
				product.setProductName(updatedproduct.getProductName());
				product.setProductPrice(updatedproduct.getProductPrice());
				product.setProductBrand(updatedproduct.getProductBrand());
				return updatedproduct;
			}
		}
		
		return null;
	}
    
}
