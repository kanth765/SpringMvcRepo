package com.ciq.ems.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.ciq.ems.pojo.Employee;
import com.ciq.ems.service.EmployeeServiceImpl;
@RestController
@RequestMapping("/rest")
public class EmployeeRestController {

	@Autowired
	private EmployeeServiceImpl employeeServiceImpl;

//	@ResponseBody
	@RequestMapping(value = "/hello", method = RequestMethod.GET, produces = MediaType.APPLICATION_JSON_VALUE)
	public String hello() {
		List<Employee> getallEmployees = employeeServiceImpl.getallEmployees();

		return "hello welcome to app";
	}

//	@ResponseBody
	@RequestMapping(value = "/getAll", method = RequestMethod.GET)
	public List<Employee> getRestEmps() {
		return employeeServiceImpl.getallEmployees();
	}

//	@ResponseBody
	@RequestMapping(value = "/emps/{id}", method = RequestMethod.GET)
	public Employee getByIdEMps(@PathVariable("id") int id) {
		return employeeServiceImpl.getById(id);

	}

}
