package dao.operations;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.query.Query;

import model.classes.Product;
import util.classes.GetSessionFactroy;

public class ProductDaoImpl implements ProductDao{
	
	private SessionFactory factory; 
	
	public ProductDaoImpl() {
		this.factory = GetSessionFactroy.getSessionFactroyInstance();
	}

	public List<Product> getAllProductInfo() {
		Session session = factory.openSession();
		Query<Product> query = session.createQuery("from Product");
		List<Product> productList= query.list();
		session.close();
		return productList;
	}

	public List<Product> getAllProductInfo(Double lessThanPrice) {
		Session session = factory.openSession();
		Query<Product> query = session.createQuery("from Product p where p.productPrice <=:price ");
		query.setParameter("price", lessThanPrice);
		List<Product> productList= query.list();
		session.close();
		return productList;
	}

	public List<Object[]> getFewColumnInfo() {
		Session session = factory.openSession();
		Query<Object[]> query = session.createQuery("select p.productName, p.productPrice from Product p");
		List<Object[]> objectArr = query.list();
		return objectArr;
	}

	public List<String> getAllProductsName() {
		Session session = factory.openSession();
		Query<String> query = session.createQuery("select p.productName from Product");
		List<String> listOfProductNames = query.list();
		return listOfProductNames;
	}

	public Integer updateAllProductPrice(Integer discount) {
		Session session = factory.openSession();
		Transaction tx = session.beginTransaction();
		Query<Product> query = session.createQuery("from Product");
		List<Product> productList= query.list();
		for (Product product : productList) {
			Double price = product.getProductPrice();
			Double updatedPrice =(price - price*(10.0/100.0)); 
			System.out.println(">>"+updatedPrice);
			product.setProductPrice(updatedPrice);
		}
		
		tx.commit();
		session.close();
		updateObject(productList);
		return null;
	}
	
	private void updateObject(List<Product> productList) {
		for (Product product : productList) {
			Session session = factory.openSession();
			Transaction tx = session.beginTransaction();
			session.update(product);
			tx.commit();
			session.close();
		}
	}

	public Integer deleteProduct(Integer productId) {
		Session session = factory.openSession();
		Transaction tx = session.beginTransaction();
		Query<Integer> query = session.createQuery("delete from Product p where p.productId =:pId");
		query.setParameter("pId", productId);
		int updatedRows = query.executeUpdate();
		tx.commit();
		session.close();
		return updatedRows;
	}

	public Integer insertNewProduct(Product product) {
		
		
		return null;
	}

}
