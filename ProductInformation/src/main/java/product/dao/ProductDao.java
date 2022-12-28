package product.dao;

public interface ProductDao {
	public Product read(Integer productId);
	public Integer insert(Product product);
	public void update(Product product);
	public void delete(Integer productId);
}
