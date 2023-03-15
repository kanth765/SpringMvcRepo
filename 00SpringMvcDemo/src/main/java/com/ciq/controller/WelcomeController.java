package com.ciq.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class WelcomeController {

	@RequestMapping("/wel")
	public String welcome() {
		return "/WEB-INF/Welcome.jsp";
	}

}
