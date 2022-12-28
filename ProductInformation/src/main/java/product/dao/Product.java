package product.dao;

public class Product {

	private Integer productId;
	private String productName;
	private Double productPrice;
	private String productType;
	private String productBrand;
	
	public Product() {}

	public Product(String productName, Double productPrice, String productType,
			String productBrand) {
		super();
		this.productName = productName;
		this.productPrice = productPrice;
		this.productType = productType;
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

	public String getProductType() {
		return productType;
	}

	public void setProductType(String productType) {
		this.productType = productType;
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
				+ ", productType=" + productType + ", productBrand=" + productBrand + "]";
	}
	
	
}
