package com.employee.Controller;

import com.employee.service.EmployeeService;

import com.employee.beans.*;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class EmployeeController {
	
	@Autowired
	public EmployeeService es;
	
	@GetMapping("/employees")
	public List<Employee> getAllEmployees(){
		return es.getEmployees();
	}
	
	@GetMapping("/employees/{empid}")
	public Employee getAllEmployee(@PathVariable String empid){
		return es.getEmployeeById(empid);
	}
	
	@GetMapping("/employeesbyname/{name}")
	public List<Employee> getEmployeeByName(@PathVariable String name){
		return es.getEmployeeByName(name);
	}
	
	@GetMapping("/employeesbySalaryRange/{lower}/{higher}")
	public List<Employee> findBySalaryRange(@PathVariable double lower,@PathVariable double higher){
		return es.findBySalaryBetween(lower,higher);
	}
	
	
	
	
	@PostMapping("/employeeadd")
	public void addEmployee(@RequestBody Employee emp) {
		es.addEmployee(emp) ;
	}
	
	@PutMapping("/employees/{empid}")
	public void updateEmployee(@RequestBody Employee emp,@PathVariable String empid) {
		es.updateEmployee(empid, emp);
	}
	
	@DeleteMapping("/employees/{empid}")
	public void deleteEmployee(@PathVariable String empid) {
		es.deleteEmployee(empid);
	}
}
