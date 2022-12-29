package product.dao;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.query.Query;

import util.classes.GetSessionFactroy;

public class ProductDaoImpl implements ProductDao{
	
	private SessionFactory factroy;
	
	public ProductDaoImpl() {
		factroy = GetSessionFactroy.getSessionFactroyInstance();
	}

	public Product read(Integer productId) {
		Session session = factroy.openSession();
		Product p = session.get(Product.class, productId);
		session.close();
		return p;
	}

	public Integer insert(Product product) {
		Session session = factroy.openSession();
		Transaction tx = session.beginTransaction();
		Integer id = (Integer)session.save(product);
		tx.commit();
		session.close();
		return id;
	}

	public void update(Product product) {
		Session session = factroy.openSession();
		Transaction tx = session.beginTransaction();
		session.update(product);
		tx.commit();
		session.close();
	}

	public void delete(Integer productId) {
		Session session = factroy.openSession();
		Transaction tx = session.beginTransaction();
		Product p = new Product();
		p.setProductId(productId);
		session.delete(p);
		tx.commit();
		session.close();
	}

	public List<Product> getAllproduct() {
		Session session = factroy.openSession();
		Query<Product>  query = session.createQuery("from Product");
		List<Product> list= query.list();
		session.close();
		return list;
	}

}
