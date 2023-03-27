package com.ciq.dao;

import java.util.List;

import com.ciq.model.Customer;

public interface CustomerDao {

	void save(Customer customer);

	public List<Customer> getCustomers();
}
