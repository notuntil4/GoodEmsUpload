package com.cognixia.jump.dao;

import java.util.List;

public interface EmployeeDao {
	
	public List<Employee> getAllEmployees();
	
	public Employee getEmployee(int id);

}
