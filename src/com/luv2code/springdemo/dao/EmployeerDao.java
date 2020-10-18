package com.luv2code.springdemo.dao;

import java.util.List;

import com.luv2code.springdemo.entity.Employee;

public interface EmployeerDao {
	
	public List<Employee> getEmployee();

	public void saveEmployee(Employee theEmployee);
}
