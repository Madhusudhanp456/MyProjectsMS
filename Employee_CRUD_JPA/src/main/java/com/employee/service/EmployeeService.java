package com.employee.service;

import com.employee.Dao.EmployeeDao;
import com.employee.beans.*;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class EmployeeService {

	/*
	 * public List<Employee> emps=new ArrayList<Employee>(
	 * 
	 * Arrays.asList(new Employee("101","Madhu","Java Developer",61500), new
	 * Employee("102","Dedeepya","dot Net Developer",30500), new
	 * Employee("103","Ashwitha","System Engineer",29500), new
	 * Employee("104","Chetan","Senior Java Developer",70500)) );
	 */
	
	@Autowired
	EmployeeDao empDao;
	
	public List<Employee> getEmployees(){
		return empDao.findAll();
	}
	
	public Employee getEmployeeById(String empid) {
		return empDao.getOne(empid);
	}
	
	
	public List<Employee> getEmployeeByName(String name) {
		//return empDao.findByName(name);
		return empDao.getEmployeeDetailsByName(name);
	}
	
	public List<Employee> findBySalaryBetween(double lower,double higher) {
		return empDao.findBySalaryBetween(lower,higher);
	}
	
	
	
	public void addEmployee(Employee emp) {
		
		empDao.save(emp);
	}
	
	public void updateEmployee( String empid, Employee emp) {
		
		/*
		 * for(int i=0; i<emps.size();i++) { Employee e=emps.get(i);
		 * if(e.getEmpid().equals(empid)) { emps.set(i, emp); } }
		 */
		empDao.save(emp);
		
	}
	public void deleteEmployee(String empid) {
		
		//emps.removeIf(e->e.getEmpid().equals(empid));
		empDao.deleteById(empid);
		
	}
}
