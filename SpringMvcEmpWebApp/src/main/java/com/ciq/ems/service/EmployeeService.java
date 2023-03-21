package com.ciq.ems.service;

import java.util.ArrayList;
import java.util.List;

import com.ciq.ems.pojo.Employee;

public interface EmployeeService {
	
	void save(Employee employee);
	
	List<Employee>  getallEmployees();

	void  update(Employee employee);

	void delete(int id);

	 Employee  getById(int id);

}
