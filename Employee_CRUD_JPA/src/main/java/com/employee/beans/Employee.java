package com.employee.beans;

import javax.persistence.Entity;
import javax.persistence.Id;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@Entity
public class Employee {
	
	@Id
	private String empid;
	private String name;
	private String designation;
	private double salary;
	
	public Employee() {
		super();
	}
	
	public Employee(String empid, String name, String designation, double salary) {
		super();
		this.empid = empid;
		this.name = name;
		this.designation = designation;
		this.salary = salary;
	}
	
	
	public String getEmpid() {
		return empid;
	}
	public void setEmpid(String empid) {
		this.empid = empid;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getDesignation() {
		return designation;
	}
	public void setDesignation(String designation) {
		this.designation = designation;
	}
	public double getSalary() {
		return salary;
	}
	public void setSalary(double salary) {
		this.salary = salary;
	}

	@Override
	public String toString() {
		return "Employee [empid=" + empid + ", name=" + name + ", designation=" + designation + ", salary=" + salary
				+ "]";
	};
	

}
