package product.api.product.api.rest.endpoints.restapi;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import product.api.product.api.rest.endpoints.service.Product;
import product.api.product.api.rest.endpoints.service.ProductService;

@RestController
public class ProductRestController {
	
	@Autowired
	ProductService productService;
	
	// http://localhost:8080/app/product
	//@RequestMapping(value = "/product", method = RequestMethod.GET)
	
	
	@GetMapping("/product")
	public List<Product> getAllProduct() {
		return this.productService.getAllProduct();
	}
	
	@GetMapping("/product/{productId}")
	public List<Product> getProduct(@PathVariable Integer productId) {
		Product product = this.productService.getProduct(productId);
		List<Product> list = new ArrayList<>();
		list.add(product);
		return list;
	}
	
	@PostMapping(path ="/product", consumes = MediaType.APPLICATION_JSON_VALUE)
	public List<Product> saveProduct(@RequestBody Product product){
		Product p = this.productService.insertProduct(product);
		List<Product> list = new ArrayList<>();
		list.add(p);
		return list;
	}
	
    @PutMapping(path="/product", consumes = "application/json")	
    public Product updateProduct(@RequestBody Product product) {
    	return this.productService.updateProduct(product);
    }
	

}
