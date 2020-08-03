package com.employee.Dao;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import com.employee.beans.Employee;

public interface EmployeeDao extends JpaRepository<Employee, String> {
	
	List<Employee> findByName(String name);
	List<Employee> findBySalaryBetween(double lower,double higher);
	
	//List<Employee> findByNameAndId(String name); converts into query
	
	@Query("from Employee where name=:empname")
	List<Employee> getEmployeeDetailsByName(@Param("empname")String name);
	
	@Query("from Employee where salary>=:lower and salary:<=higher")
	List<Employee> getEmployeeDetailsBySalary(@Param("lower")double lowsal,@Param("lower")double highsal);

}
