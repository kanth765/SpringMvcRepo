package com.ciq.ems.controller;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.WebDataBinder;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.InitBinder;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import com.ciq.ems.dao.EmployeeDaoImpl;
import com.ciq.ems.pojo.Employee;
import com.ciq.ems.service.EmployeeServiceImpl;

@Controller
public class EmployeeController {

	@InitBinder
	public void binderBeans(WebDataBinder binder) {
//		binder.setDisallowedFields(new String[] { "name" });
	}

	@Autowired
	private EmployeeServiceImpl employeeServiceImpl;

	@RequestMapping(value = "/listEmps", method = RequestMethod.GET)
	public ModelAndView getAllEmps() throws IOException {
//		List<Employee> employees = new ArrayList<>();
//		employees.add(new Employee(1, "anil", 11000));
//		employees.add(new Employee(1, "anil", 11000));
//		employees.add(new Employee(1, "anil", 11000));
//		employees.add(new Employee(1, "anil", 11000));

//		ModelAndView modelAndView=new ModelAndView();
//		String exceptionOccured = "IO_Exception";
//		if (exceptionOccured.equalsIgnoreCase("null_pointer")) {
//			throw new NullPointerException("Null pointer exception");
//		} else if (exceptionOccured.equalsIgnoreCase("IO_Exception")) {
//			throw new IOException("Io excepiton");
//		}
		
		String error="error";
		if(error.equalsIgnoreCase("Error")) {
			throw new NullPointerException();
		}
		return new ModelAndView("list-emp", "emps", employeeServiceImpl.getallEmployees());
	}

	@RequestMapping("/new")
	public String newEmp() {
		return "save-emp";
	}

//	@RequestMapping(value = "save" , method = RequestMethod.POST)
	@PostMapping("/save")
	public ModelAndView saveEmp(@Valid @ModelAttribute("employee") Employee employee, BindingResult restuls) {
		if (restuls.hasErrors()) {
			return new ModelAndView("save-emp");
		}
		employeeServiceImpl.save(employee);
		ModelAndView model = new ModelAndView("redirect:/listEmps");
		return model;
	}

	@GetMapping("/updateEmp")
	public String update(@RequestParam("id") int id, @ModelAttribute("employee") Employee employee) {
		employee = employeeServiceImpl.getById(id);
//		, Model model
//		model.addAttribute("employee", employee);
		return "update-emp";
	}

	@PostMapping("/update")
	public String update(Employee employee) {
		employeeServiceImpl.update(employee);
		return "redirect:/listEmps";
	}

	@GetMapping("/deleteEmp")
	public String delete(@RequestParam("id") int id) {
		employeeServiceImpl.delete(id);
		return "redirect:/listEmps";
	}

//	@ExceptionHandler(value = NullPointerException.class)
//	public String handleNullpointerException(Exception exception) {
//		System.out.println("null poiner exception occured: " + exception);
//		return "nullpointerPage";
//	}
//
//	@ExceptionHandler(value = IOException.class)
//	public String handleIOException(Exception exception) {
//		System.out.println("Io exception occured: " + exception);
//		return "IoException";
//	}
	
//	@ExceptionHandler(value = Exception.class)
//	public String handleIOException(Exception exception) {
//		System.out.println(" exception occured: " + exception);
//		return "exception-error";
//	}
}
