package com.ciq.dao;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.orm.hibernate5.HibernateTemplate;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.ciq.model.Customer;

@Repository("customerDaoImpl")

public class CustomerDaoImpl implements CustomerDao {

	@Autowired
	private HibernateTemplate hibernateTemplate;

	@Transactional
	public void save(Customer customer) {
		hibernateTemplate.save(customer);

	}

	public List<Customer> getCustomers() {
		return hibernateTemplate.loadAll(Customer.class);
	}

}
