package com.ciq.ems.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import com.ciq.ems.pojo.Employee;

@Controller
public class EmployeeController {

	@RequestMapping(value = "/listEmps", method = RequestMethod.GET)
	public ModelAndView getAllEmps() {
		List<Employee> employees = new ArrayList<>();
		employees.add(new Employee(1, "anil", 11000));
		employees.add(new Employee(1, "anil", 11000));
		employees.add(new Employee(1, "anil", 11000));
		employees.add(new Employee(1, "anil", 11000));
		
	
//		ModelAndView modelAndView=new ModelAndView();
//		modelAndView.ad
		return new ModelAndView("list-emp", "emps", employees);
	}
	
	@RequestMapping("/new")
	public String newEmp() {
		return "save-emp";
	}
	
//	@RequestMapping(value = "save" , method = RequestMethod.POST)
	@PostMapping("/save")
	public String saveEmp(Employee employee) {
		System.out.println(employee);
		return"list-emp";
	}

}
