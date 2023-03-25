package com.ciq.ems.client;

import java.util.List;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.ciq.ems.dao.EmployeeDaoImpl;
import com.ciq.ems.model.Employee;
import com.ciq.ems.service.EmployeeServiceImpl;

public class EmployeeClient {

	public static void main(String[] args) {

		Employee employee = new Employee("anil", 23000.00);
		ApplicationContext context = new ClassPathXmlApplicationContext("spring.xml");
//		EmployeeDaoImpl bean = (EmployeeDaoImpl) context.getBean("employeeDaoImpl");
//		System.out.println(bean);
//		bean.save(employee);
		EmployeeServiceImpl service = context.getBean(EmployeeServiceImpl.class);
//		service.save(employee);
		List<Employee> employees = service.getEmployees();
		employees.forEach(System.out::println);
	}

}
