package com.luv2code.springdemo.service;

import java.util.List;

import com.luv2code.springdemo.entity.Employee;

public interface EmployeerService {

	public List<Employee> geEmployee();

	public void saveEmployee(Employee theEmployee);

	public Employee geEmployee(int theId);

	public void deleteEmployee(int theId);
}
