package com.ciq.ems.service;

import java.util.List;

import com.ciq.ems.model.Employee;
public interface EmployeeService {

	void save(Employee employee);

	List<Employee> getEmployees();

}
