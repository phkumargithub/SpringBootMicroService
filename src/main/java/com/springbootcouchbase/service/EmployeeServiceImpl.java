package com.springbootcouchbase.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.springbootcouchbase.model.Employee;
import com.springbootcouchbase.repository.EmployeeRepository;

@Service
public class EmployeeServiceImpl implements EmployeeService{

	@Autowired
	private EmployeeRepository employeeRepo;

	@Override
	public Employee getEmployeeById(String id) {
		return employeeRepo.findOne(id);	
		}

	@Override
	public List<Employee> getEmployeeByFirstName(String firstName) {
		return employeeRepo.findByFirstName(firstName);
	}

	@Override
	public void create(Employee emp) {
		employeeRepo.save(emp);
		
	}

}
