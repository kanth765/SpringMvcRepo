package com.ciq.ems.dao;

import java.util.List;

import org.springframework.stereotype.Repository;

import com.ciq.ems.model.Employee;
@Repository
public interface EmployeeDao {

	void save(Employee employee);

	List<Employee> getEmployees();
}
