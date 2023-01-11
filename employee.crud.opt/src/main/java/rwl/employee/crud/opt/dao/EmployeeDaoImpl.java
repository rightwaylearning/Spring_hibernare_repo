package rwl.employee.crud.opt.dao;

import java.util.List;
import rwl.employee.crud.opt.entity.Employee;

import org.hibernate.Criteria;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.criterion.Criterion;
import org.hibernate.criterion.Restrictions;
import org.hibernate.query.Query;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

@Repository
public class EmployeeDaoImpl implements EmployeeDao {
    
	@Autowired
	SessionFactory sessionFactory;
	
	@Override
	public List<Employee> getEmployee() {
        Session session = sessionFactory.openSession();
		Criteria ctr = session.createCriteria(Employee.class);
		List<Employee> list = ctr.list();
		session.close();
		return list;
	}

	@Override
	public Employee getEmployee(Integer employeeId) {
		    Session session = sessionFactory.openSession();
			Criteria ctr = session.createCriteria(Employee.class);
			Criterion c = Restrictions.eq("employeeNumber", employeeId);
			ctr.add(c);
			List<Employee> list = ctr.list();
			session.close();
			if(list.size() == 1) {
				return list.get(0);
			}
			return null;
	}

	@Override
	public Integer saveEmployee(Employee employee) {
		Session session = sessionFactory.openSession();
		Transaction tx = session.beginTransaction();
		Integer i = (Integer)session.save(employee);
		tx.commit();
		session.close();
		return i;
	}

	@Override
	public Employee updateEmployee(Employee employee) {
		Session session = sessionFactory.openSession();
		Transaction tx = session.beginTransaction();
		Employee emp = (Employee)session.merge(employee);
		tx.commit();
		session.close();
		return emp;
	}

	@Override
	public Integer deleteEmployee(Integer employeeId) {
		Session session = sessionFactory.openSession();
		Transaction tx = session.beginTransaction();
		Query<Employee> query = session.createQuery("delete from Employee e where e.employeeNumber =:id");
		query.setParameter("id", employeeId);
		int i = query.executeUpdate();
		tx.commit();
		session.close();
		return i;
	}

}
