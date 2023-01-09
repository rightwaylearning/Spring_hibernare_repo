package web.service.rest.api.web.app.dao;

import java.util.List;

import org.hibernate.SQLQuery;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import web.service.rest.api.web.app.entity.Product;

@Repository
public class ProductdaoImpl implements ProductDao {

	@Autowired
	SessionFactory sessionFactory;
	
	@Override
	public List<Object[]> getProduct(Integer productId) {
		Session session= sessionFactory.openSession();
		SQLQuery query = session.createSQLQuery("select * from product where product_id =:productId");
		query.setParameter("productId", productId);
		List<Object[]> list = query.list();
		session.close();
		return list;
	}

	@Override
	public List<Object[]> getProducts() {
		Session session= sessionFactory.openSession();
		SQLQuery query = session.createSQLQuery("select * from product");
		List<Object[]> list = query.list();
		session.close();
		return list;
	}

	@Override
	public Integer saveProduct(Product product) {
		Session session= sessionFactory.openSession();
		Transaction tx = session.beginTransaction();
		SQLQuery query = session.createSQLQuery("insert into product values(?,?,?,?,?)");
		query.setParameter(1, product.getProductId());
		query.setParameter(2, product.getProductName());
		query.setParameter(3, product.getProductPrice());
		query.setParameter(4, product.getProductType());
		query.setParameter(5, product.getProductBrand());
		int updatedRows = query.executeUpdate();
		tx.commit();
		session.close();
		return updatedRows;
	}

	@Override
	public Integer updateProduct(Product product) {
		Session session= sessionFactory.openSession();
		Transaction tx = session.beginTransaction();
		SQLQuery query = session.createSQLQuery("update product set product_name = ? , product_price = ? , product_type = ? ,product_brand = ?  where product_id = ?");
		query.setParameter(1, product.getProductName());
		query.setParameter(2, product.getProductPrice());
		query.setParameter(3, product.getProductType());
		query.setParameter(4, product.getProductBrand());
		query.setParameter(5, product.getProductId());
		int updatedRows = query.executeUpdate();
		tx.commit();
		session.close();
		return updatedRows;
	}

	@Override
	public Integer deleteProduct(Integer productId) {
		Session session= sessionFactory.openSession();
		Transaction tx = session.beginTransaction();
		SQLQuery query = session.createSQLQuery("delete from product  where product_id = ?");
		query.setParameter(1, productId);
		int updatedRows = query.executeUpdate();
		tx.commit();
		session.close();
		return updatedRows;
	}

}
