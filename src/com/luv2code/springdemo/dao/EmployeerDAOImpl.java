package com.luv2code.springdemo.dao;

import java.util.List;

import javax.transaction.Transactional;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.query.Query;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.luv2code.springdemo.entity.Employee;

@Repository
public class EmployeerDAOImpl implements EmployeerDao {

	//inject hibernate session factory
	@Autowired
	private SessionFactory sessionFactory;
	
	
	@Override
	public List<Employee> getEmployee() {
		
		Session currentSession = sessionFactory.getCurrentSession();
		Query<Employee> theQuery=
				currentSession.createQuery("from Employee",Employee.class);
		List<Employee> employee = theQuery.getResultList();
		return employee;
	}


	@Override
	public void saveEmployee(Employee theEmployee) {
		Session currentSession = sessionFactory.getCurrentSession();
		currentSession.saveOrUpdate(theEmployee);
	}


	@Override
	public Employee getEmployee(int theId) {
		Session currentSession = sessionFactory.getCurrentSession();
		Employee theEmployee = currentSession.get(Employee.class, theId);
		return theEmployee;
	}

}
