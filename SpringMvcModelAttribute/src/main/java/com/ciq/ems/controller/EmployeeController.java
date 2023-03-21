package com.ciq.ems.controller;

import javax.validation.Valid;

import org.springframework.stereotype.Controller;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.WebDataBinder;
import org.springframework.web.bind.annotation.InitBinder;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import com.ciq.ems.model.Employee;
//custome annotations
// interceptors

@Controller
public class EmployeeController {
	
	@InitBinder
	public void bindresul(WebDataBinder binder) {
		binder.setDisallowedFields(new String [] {"name"});
	}

	@RequestMapping(value = { "/home", "/" })
	public String home() {
		return "index";
	}

	@RequestMapping(value = "/new", method = RequestMethod.GET)
	public String newEmpReg() {
		return "emp-save";
	}

	@RequestMapping(value = "save", method = RequestMethod.POST)
	public ModelAndView regEmp(@Valid @ModelAttribute("employee") Employee employee, BindingResult bindingResult) {
//		req.setAttr("empl",employee)
//		req.getRequestDos.fr(reg)
		
//		int id=Integer.parseInt(req.get())
		if(bindingResult.hasErrors()) {
			return new ModelAndView("emp-save");
		}
		ModelAndView modelAndView = new ModelAndView("reg-success");
//		modelAndView.addObject(employee);
		return modelAndView;

	}

}
