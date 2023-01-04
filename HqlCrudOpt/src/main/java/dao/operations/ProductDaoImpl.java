package dao.operations;

import java.io.Serializable;
import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.query.Query;

import model.classes.Product;
import model.classes.Temp;
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

	public Integer updateAllProductPrice(double discount) {
		Session session = factory.openSession();
		Transaction tx = session.beginTransaction();
		Query<Product> query = session.createQuery("update Product p set p.productPrice =  p.productPrice - (p.productPrice * "+discount+" )");
		//query.setParameter(0, discount);
		int i = query.executeUpdate();
		tx.commit();
		session.close();
		return i;
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

	public Integer insertNewProduct() {
		String insertQuery = "insert into Product(productId,productName,productPrice,productType,productBrand) "
				+ "select pId,pName,pPrice,pType,pBrand from Temp";
		Session session = factory.openSession();
		Transaction tx = session.beginTransaction();
		Query<Integer> query = session.createQuery(insertQuery);
		int insertedRows = query.executeUpdate();
		tx.commit();
		session.close();
		return insertedRows;
	}

	public Integer deleteTempRecords() {
		Session session = factory.openSession();
		Transaction tx = session.beginTransaction();
		Query<Integer> query = session.createQuery("delete from Temp");
		int updatedRows = query.executeUpdate();
		tx.commit();
		session.close();
		return updatedRows;
	}

	public Integer saveRecordIntoTemp(Temp temp) {
		Session session = factory.openSession();
		Transaction tx = session.beginTransaction();
		Serializable id =session.save(temp);
		tx.commit();
		session.close();
		return (Integer)id;
	}

}
