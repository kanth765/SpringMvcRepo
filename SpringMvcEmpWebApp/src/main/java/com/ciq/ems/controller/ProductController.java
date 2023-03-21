package com.ciq.ems.controller;

import java.io.IOException;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class ProductController {

	@RequestMapping("/prds")
	public String getproducts() throws IOException {
		String exceptionOccured = "IO_Exception";
		if (exceptionOccured.equalsIgnoreCase("null_pointer")) {
			throw new NullPointerException("Null pointer exception");
		} else if (exceptionOccured.equalsIgnoreCase("IO_Exception")) {
			throw new IOException("Io excepiton");
		}
		return "products";

	}

}
