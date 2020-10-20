package com.luv2code.springdemo.entity;

import java.util.Comparator;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;


@Entity
@Table(name = "employee")
public class Employee {
	
	@Id
	@Column(name="id")
	private int id;
	
	@Column(name="name")
	private String name;
	
	@Column(name="cloud_tech")
	private String cloud_tech;
	
	public Employee() {
		
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
	

	public String getCloud_tech() {
		return cloud_tech;
	}

	public void setCloud_tech(String cloud_tech) {
		this.cloud_tech = cloud_tech;
	}
	public static Comparator<Employee> empNameComparator = new Comparator<Employee>() {

		@Override
		public int compare(Employee e1, Employee e2) {
			String emp1 =  e1.getName().toLowerCase();
			String emp2 = e2.getName().toLowerCase();
			
			return 	emp1.compareTo(emp2);
		}
			
	};
	public static Comparator<Employee> empCloudComparator = new Comparator<Employee>() {

		@Override
		public int compare(Employee e1, Employee e2) {
			String emp1 =  e1.getCloud_tech().toLowerCase();
			String emp2 = e2.getCloud_tech().toLowerCase();
			
			return 	emp1.compareTo(emp2);
		}
			
	};
	
	public static Comparator<Employee> empIdComparator = new Comparator<Employee>() {

		@Override
		public int compare(Employee e1, Employee e2) {
			int emp1 =  e1.getId();
			int emp2 = e2.getId();
			
			return 	Integer.compare(emp1, emp2);
		}
			
	};

	@Override
	public String toString() {
		return "Employee [id=" + id + ", name=" + name + ", cloud_tech=" + cloud_tech + "]";
	}
	
}
