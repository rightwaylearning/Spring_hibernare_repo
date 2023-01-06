package web.service.rest.api.web.app.dao;

import java.util.List;

import org.hibernate.SQLQuery;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import web.service.rest.api.web.app.entity.Product;

@Repository
public class ProductdaoImpl implements ProductDao {

	@Autowired
	SessionFactory sessionFactory;
	
	@Override
	public List<Object[]> getProduct(Integer productId) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Object[]> getProducts() {
		Session session= sessionFactory.openSession();
		SQLQuery query = session.createSQLQuery("select * from product");
		List<Object[]> list = query.list();
		return list;
	}

	@Override
	public Integer saveProduct(Product product) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Integer updateProduct(Product product) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Integer deleteProduct(Integer productId) {
		// TODO Auto-generated method stub
		return null;
	}

}
