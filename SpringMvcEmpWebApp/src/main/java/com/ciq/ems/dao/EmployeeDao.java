package com.ciq.ems.dao;

import java.util.ArrayList;
import java.util.List;

import com.ciq.ems.pojo.Employee;

public interface EmployeeDao {
	
	void save(Employee employee);
	
	List<Employee>  getallEmployees();

	void  update(Employee employee);

	void delete(Integer id);

	 Employee getById(Integer id);
}
