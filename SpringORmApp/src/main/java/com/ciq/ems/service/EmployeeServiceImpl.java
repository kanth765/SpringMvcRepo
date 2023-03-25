package com.ciq.ems.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.ciq.ems.dao.EmployeeDaoImpl;
import com.ciq.ems.model.Employee;

@Service
public class EmployeeServiceImpl implements EmployeeService {

	@Autowired
	private EmployeeDaoImpl employeeDaoImpl;

	@Override
	public void save(Employee employee) {
		employeeDaoImpl.save(employee);
	}

	@Override
	public List<Employee> getEmployees() {
		return employeeDaoImpl.getEmployees();
	}

}
