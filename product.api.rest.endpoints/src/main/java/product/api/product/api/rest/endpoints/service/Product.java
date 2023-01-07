package product.api.product.api.rest.endpoints.service;

import org.springframework.stereotype.Controller;

@Controller
public class Product {
	private Integer productId;
	private String productName;
	private Double productPrice;
	private String productBrand;
	
	public Product() {}

	public Product(Integer productId, String productName, Double productPrice, String productBrand) {
		super();
		this.productId = productId;
		this.productName = productName;
		this.productPrice = productPrice;
		this.productBrand = productBrand;
	}

	public Integer getProductId() {
		return productId;
	}

	public void setProductId(Integer productId) {
		this.productId = productId;
	}

	public String getProductName() {
		return productName;
	}

	public void setProductName(String productName) {
		this.productName = productName;
	}

	public Double getProductPrice() {
		return productPrice;
	}

	public void setProductPrice(Double productPrice) {
		this.productPrice = productPrice;
	}

	public String getProductBrand() {
		return productBrand;
	}

	public void setProductBrand(String productBrand) {
		this.productBrand = productBrand;
	}

	@Override
	public String toString() {
		return "Product [productId=" + productId + ", productName=" + productName + ", productPrice=" + productPrice
				+ ", productBrand=" + productBrand + "]";
	}

}
