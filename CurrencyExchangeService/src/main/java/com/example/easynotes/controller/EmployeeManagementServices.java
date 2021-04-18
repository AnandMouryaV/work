package com.example.easynotes.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.easynotes.exception.EmployeeNotfoundException;
import com.example.easynotes.model.Employee;
import com.example.easynotes.repository.EmployeeManagementDao;

@RestController
@RequestMapping("/api")
public class EmployeeManagementServices {
	
	@Autowired EmployeeManagementDao employeemanagementDao;
	
	@PostMapping("/employee")
	
	public void addEmployee(@RequestBody Employee employee) {
		
		employeemanagementDao.save(employee);
		
	}
	
@GetMapping("/employees")
	
	public List<Employee> getAllEmployee() {
		
		return employeemanagementDao.findAll();
		
	}


@GetMapping("/employee/{id}")

public Optional<Employee> getEmployee(@PathVariable long id) {
	
	Optional<Employee> employee = employeemanagementDao.findById((long) id);
	
if(!employee.isPresent())
		throw new EmployeeNotfoundException("Employee doesn't exist-"+id);
	
	return employee;
	
}
}
