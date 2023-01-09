package web.service.rest.api.web.app.restendpoint;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import web.service.rest.api.web.app.entity.Product;
import web.service.rest.api.web.app.service.ProductServicesImpl;

// this my rest api class, even no need to add @Controller here
// inside @RestControoler contain @Controller
@RestController
@RequestMapping("/app")
public class FirstRestEndPoint {

	@Autowired
	ProductServicesImpl productServicesImpl;

	// http://localhost:9090/app/product >> GET
	@GetMapping("/product")
	public List<Product> getAllProduct() {
		return productServicesImpl.getProducts();
	}

	// http://localhost:9090/app/product >> GET
	@GetMapping("/product/{productId}")
	public Product getProduct(@PathVariable Integer productId) {
		return productServicesImpl.getProduct(productId);
	}
	
	@PostMapping(path = "/product",produces = "application/json", consumes = "application/json")
    public Product saveProduct(@RequestBody Product product) {
		Integer i = productServicesImpl.saveProduct(product);
		if(i == 1) {
			return product;
		}
		return null;
	}
	
	@PutMapping(path = "/product",produces = "application/json", consumes = "application/json")
    public Product updateProduct(@RequestBody Product product) {
		Integer i = productServicesImpl.updateProduct(product);
		if(i == 1) {
			return product;
		}
		return null;
	}
	
	@DeleteMapping("/product/{productId}")
	public String deleteProduct(@PathVariable Integer productId) {
		Integer i = productServicesImpl.deleteProduct(productId);
		if(i ==1) {
			return "deleted";
		}
		
		return "Sorry";
	}
	
	
}
