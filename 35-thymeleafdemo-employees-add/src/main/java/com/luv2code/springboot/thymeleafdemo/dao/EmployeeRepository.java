package com.luv2code.springboot.thymeleafdemo.dao;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.luv2code.springboot.thymeleafdemo.entity.Employee;

public interface EmployeeRepository extends JpaRepository<Employee, Integer> {

	// there is no need to write any code!!!!
	
	// add a method to sort by last name
	public List<Employee> findAllByOrderByLastNameAsc();
}
