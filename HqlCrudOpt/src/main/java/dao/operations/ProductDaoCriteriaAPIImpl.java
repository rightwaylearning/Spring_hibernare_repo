package dao.operations;

import java.util.List;

import org.hibernate.Criteria;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.criterion.Criterion;
import org.hibernate.criterion.Projection;
import org.hibernate.criterion.ProjectionList;
import org.hibernate.criterion.Projections;
import org.hibernate.criterion.Restrictions;

import model.classes.Product;
import model.classes.Temp;
import util.classes.GetSessionFactroy;

public class ProductDaoCriteriaAPIImpl implements ProductDao {

	private SessionFactory factory; 
	
	public ProductDaoCriteriaAPIImpl() {
		this.factory = GetSessionFactroy.getSessionFactroyInstance();
	}
	
	public List<Product> getAllProductInfo() {
		Session session = this.factory.openSession();
		Criteria ctr = session.createCriteria(Product.class);
		List<Product> list = ctr.list();
		session.close();
		return list;
	}

	public List<Product> getAllProductInfo(Double lessThanPrice) {
		Session session = this.factory.openSession();
		Criteria ctr = session.createCriteria(Product.class);
		
		Criterion cri = Restrictions.lt("productPrice", lessThanPrice);
		ctr.add(cri);
		
		List<Product> list = ctr.list();
		session.close();
		return list;
	}

	public List<Product> multipleFilters(Double lessThanPrice, String branchName){
		
		Session session = this.factory.openSession();
		Criteria ctr = session.createCriteria(Product.class);
		
		Criterion cri1 = Restrictions.lt("productPrice", lessThanPrice);
		Criterion cri2 = Restrictions.eq("productBrand", branchName);
		Criterion  cod = Restrictions.or(cri1, cri2);
		
		ctr.add(cod);
		List<Product> list = ctr.list();
		session.close();
		return list;
	}
	
	
	public List<Object[]> getFewColumnInfo() {
		Session session = this.factory.openSession();
		Criteria ctr = session.createCriteria(Product.class);
		
		Projection p1 = Projections.property("productName");
		Projection p2 = Projections.property("productPrice");
		
		ProjectionList list = Projections.projectionList();
		list.add(p1);
		list.add(p2);
		
		ctr.setProjection(list);
		
		//-----------------------------
		Criterion cri = Restrictions.lt("productPrice", 1000.00);
		ctr.add(cri);
		
		List<Object[]> list1 = ctr.list();
		session.close();
		return list1;
	}
	
	public List<Object[]> sunOfAllproductPrice() {
		
		Session session = this.factory.openSession();
		Criteria ctr = session.createCriteria(Product.class);
		
		Projection p1= Projections.sum("productPrice");
		Projection p2= Projections.max("productPrice");
		
		ProjectionList list1 = Projections.projectionList();
		list1.add(p1);
		list1.add(p2);
		
		ctr.setProjection(list1);
		
		List<Object[]> list = ctr.list();
		session.close();
		
		return list;
	}
	
	public List<Product> pagination(int start, int end) {
		Session session = this.factory.openSession();
		Criteria ctr = session.createCriteria(Product.class);
		ctr.setFirstResult(start);
		ctr.setMaxResults(end);
		List<Product> list = ctr.list();
		session.close();
		return list;
	}

	public List<String> getAllProductsName() {
		// TODO Auto-generated method stub
		return null;
	}

	public Integer updateAllProductPrice(double discount) {
		// TODO Auto-generated method stub
		return null;
	}

	public Integer deleteProduct(Integer productId) {
		// TODO Auto-generated method stub
		return null;
	}

	public Integer insertNewProduct() {
		// TODO Auto-generated method stub
		return null;
	}

	public Integer deleteTempRecords() {
		// TODO Auto-generated method stub
		return null;
	}

	public Integer saveRecordIntoTemp(Temp temp) {
		// TODO Auto-generated method stub
		return null;
	}

	
}
