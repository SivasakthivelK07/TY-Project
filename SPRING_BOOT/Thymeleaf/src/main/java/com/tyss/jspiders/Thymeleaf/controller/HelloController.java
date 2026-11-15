package com.tyss.jspiders.Thymeleaf.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@RequestMapping(path = "api")
@Controller
public class HelloController {

	@GetMapping(path = "/hello")
	public String hello(
			@RequestParam(name = "name",defaultValue = "World", required = true) String name,
			Model model ) {
		model.addAttribute("name", name);	
		
		return "hello";
	}
	
}
