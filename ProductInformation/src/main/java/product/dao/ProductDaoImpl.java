package product.dao;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;

import util.classes.GetSessionFactroy;

public class ProductDaoImpl implements ProductDao{
	
	private SessionFactory factroy;
	
	public ProductDaoImpl() {
		factroy = GetSessionFactroy.getSessionFactroyInstance();
	}

	public Product read(Integer productId) {
		Session session = factroy.openSession();
		return session.load(Product.class, productId);
	}

	public Integer insert(Product product) {
		Session session = factroy.openSession();
		Transaction tx = session.beginTransaction();
		Integer id = (Integer)session.save(product);
		tx.commit();
		return id;
	}

	public void update(Product product) {
		Session session = factroy.openSession();
		Transaction tx = session.beginTransaction();
		session.update(product);
		tx.commit();
	}

	public void delete(Integer productId) {
		Session session = factroy.openSession();
		Transaction tx = session.beginTransaction();
		Product p = new Product();
		p.setProductId(productId);
		session.delete(p);
		tx.commit();
	}

}
