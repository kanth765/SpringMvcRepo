package com.ciq.ems.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ciq.ems.dao.EmployeeDaoImpl;
import com.ciq.ems.pojo.Employee;

@Service
public class EmployeeServiceImpl implements EmployeeService {

	@Autowired
	private EmployeeDaoImpl employeeDaoImpl;

	@Override
	public void save(Employee employee) {
		employeeDaoImpl.save(employee);
	}

	@Override
	public List<Employee> getallEmployees() {
		return employeeDaoImpl.getallEmployees();
	}

	@Override
	public void update(Employee employee) {
		employeeDaoImpl.update(employee);
	}

	@Override
	public void delete(int id) {
		employeeDaoImpl.delete(id);

	}

	@Override
	public  Employee getById(int id) {
		return employeeDaoImpl.getById(id);
	}

}
