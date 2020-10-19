package com.luv2code.springdemo.service;

import java.util.List;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.luv2code.springdemo.dao.EmployeerDao;
import com.luv2code.springdemo.entity.Employee;

@Service
public class EmployeerServiceImpl implements EmployeerService {
	

	//inject dao
	@Autowired
	private EmployeerDao employeeDAO;
	@Override
	@Transactional
	public List<Employee> geEmployee() {
		return employeeDAO.getEmployee();
	}
	@Override
	@Transactional
	public void saveEmployee(Employee theEmployee) {
		employeeDAO.saveEmployee(theEmployee);
	}
	@Override
	@Transactional
	public Employee geEmployee(int theId) {
		// TODO Auto-generated method stub
		return employeeDAO.getEmployee(theId);
	}
	@Override
	@Transactional
	public void deleteEmployee(int theId) {
		// TODO Auto-generated method stub
		employeeDAO.deleteEmployee(theId);
	}

}
