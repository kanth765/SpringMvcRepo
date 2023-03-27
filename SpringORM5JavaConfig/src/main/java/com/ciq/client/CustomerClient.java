package com.ciq.client;

import java.util.List;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.ciq.config.CustomerConfig;
import com.ciq.dao.CustomerDaoImpl;
import com.ciq.model.Customer;

public class CustomerClient {

	public static void main(String[] args) {
		Customer customer = new Customer("anil", "hyd");
		ApplicationContext context = new AnnotationConfigApplicationContext(CustomerConfig.class);
		CustomerDaoImpl cd = context.getBean(CustomerDaoImpl.class);
//		System.out.println(cd);
//		cd.save(customer);
		List<Customer> customers = cd.getCustomers();
		customers.forEach(System.out::println);

	}

}
