package product.dao;

public class ProductUtil {

	public static ProductDao getDaoImplInstance() {
		return new ProductDaoImpl();
	}
}
