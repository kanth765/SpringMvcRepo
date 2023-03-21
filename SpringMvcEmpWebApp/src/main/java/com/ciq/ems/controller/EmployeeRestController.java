package com.ciq.ems.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.ciq.ems.service.EmployeeServiceImpl;

@RestController
public class EmployeeRestController {

	@Autowired
	private EmployeeServiceImpl employeeServiceImpl;

	@RequestMapping("/findAll")
	public String hello() {
		employeeServiceImpl.getallEmployees();
		return "hello welcome to rest controller";
	}
}
