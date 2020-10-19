package com.luv2code.springdemo.controller;

import java.util.Collections;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.luv2code.springdemo.dao.EmployeerDao;
import com.luv2code.springdemo.entity.Employee;
import com.luv2code.springdemo.service.EmployeerService;

@Controller
@RequestMapping("/employee")
public class EmployeeController {
	
	//inject service
	@Autowired
	private EmployeerService employeeService;
	
	
	@GetMapping("/list")
	public String listCustomers(Model theModel) {
		//get employee
		List<Employee> theEmployees = employeeService.geEmployee();
		
		theModel.addAttribute("employees",theEmployees);
		return "list-employee";
	}
	@GetMapping("/showFormForAdd")
	public String showFormForAdd(Model theModel) {
		Employee theEmployee = new Employee();
		theModel.addAttribute("employee",theEmployee);
		
		
		return "employee-form";
	}
	@GetMapping("/orderByFirstName")
	public String orderByFirstName(Model model) {
		List<Employee> theEmployee = employeeService.geEmployee();	
		Collections.sort(theEmployee, Employee.empNameComparator);
		model.addAttribute("employee", theEmployee);	
			return "list-employee";
	}
	
	@GetMapping("/orderById")
	public String orderById(Model model) {
		List<Employee> theEmployee = employeeService.geEmployee();	
		Collections.sort(theEmployee, Employee.empIdComparator);
		model.addAttribute("employee", theEmployee);	
			return "list-employee";
	}
	@GetMapping("/showFormForUpdate")
	public String showFormForUpdate(@RequestParam("employeeId") int theId,
										Model theModel){
		Employee theEmployee = employeeService.geEmployee(theId);
		theModel.addAttribute("employee",theEmployee);
		return "employee-form";
	}
	
	
	
		@PostMapping("/saveEmployee")
		public String saveEmployee(@ModelAttribute("employee") Employee theEmployee) {
			employeeService.saveEmployee(theEmployee);
			
			return "redirect:/employee/list";
		}
}