package com.tyss.sms.controller;

import javax.servlet.http.HttpServletRequest;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.tyss.sms.dto.StudentDTO;

@RequestMapping(path = "/student")
@Controller
public class StudentController {

	@RequestMapping(path = "/login", method = RequestMethod.GET)
	public String login() {
		return "login";
	}

	@RequestMapping(path = "/login", method = RequestMethod.POST)
	public String login(@ModelAttribute StudentDTO dto, ModelMap map) {
		System.out.println(dto.getName());
		System.out.println(dto.getEmail());
		System.out.println(dto.getPassword());

		map.addAttribute("message", "Welcome Mr." + dto.getName());
		// TODO: To provide login implementation for after some time
		return "welcome";
	}

	@RequestMapping(path = "/register", method = RequestMethod.GET)
	public String register() {
		return "register";
	}

	@RequestMapping(path = "/register", method = RequestMethod.POST)
	public String register(HttpServletRequest request, Model model) {
		// TODO: To provide register implementation for after some time
		String id = request.getParameter("id");
		String name = (String) request.getAttribute("name");
		System.out.println(id + "  " + name);

		model.addAttribute("message", "Register Successfully " + name);
		return "login";
	}

}
