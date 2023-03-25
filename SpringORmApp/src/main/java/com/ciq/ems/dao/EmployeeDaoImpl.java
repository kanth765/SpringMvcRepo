package com.ciq.ems.dao;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.orm.hibernate4.HibernateTemplate;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.ciq.ems.model.Employee;

@Repository
@Transactional
public class EmployeeDaoImpl implements EmployeeDao {

	@Autowired
	private HibernateTemplate hibernateTemplate;

	
	@Override
	public void save(Employee employee) {
		hibernateTemplate.save(employee);

	}

	@Override
	public List<Employee> getEmployees() {
		List<Employee> loadAll = hibernateTemplate.loadAll(Employee.class);
		return loadAll;
	}

}
