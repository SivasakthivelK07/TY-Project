package com.tyss.ems.contoller;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import com.tyss.ems.dto.EmployeeRegisterDTO;
import com.tyss.ems.service.EmsService;

@RequestMapping(path = "/t2")
@Controller
public class EmsControllerT2 {

	@Autowired
	private EmsService emsService;

	@RequestMapping(path = "/login", method = RequestMethod.GET)
	public String welcome() {
		return "login";
	}

	//1.Getting for object
	@RequestMapping(path = "/login", method = RequestMethod.POST)
	public String login(HttpServletRequest request, Model model) {
		String id = request.getParameter("id");
		String password = request.getParameter("password");
		System.out.println(id + " : " + password);

		Boolean isAuthenticated = emsService.checkCredentials(id, password);

		model.addAttribute("id", id);
		return "home";
	}

	@RequestMapping(path = "/register", method = RequestMethod.GET)
	public String register() {
		return "register";
	}

	//2.way to getting the object
	@RequestMapping(path = "/register", method = RequestMethod.POST)
	public String register(@ModelAttribute EmployeeRegisterDTO dto, ModelMap model) {

		String registerId = emsService.register(dto);

		model.addAttribute("message", "Register Successfully,With register ID: " + registerId);	

		return "login";
	}

	@RequestMapping(path = "/change-password", method = RequestMethod.GET)
	public String changePassword() {
		return "change_password";
	}

	//3.way to getting the object
	@RequestMapping(path = "/change-password", method = RequestMethod.POST)
	public String changePassword(@RequestParam String id,
			@RequestParam String password,
			@RequestParam String changePassword, 
			@RequestParam String changePassword_, 
			Model model 
	) {

		if (changePassword.equals(changePassword_)) {
			Boolean isChanged = emsService.changePassword(id, password, changePassword);
			model.addAttribute("messageResponse", "Password Changed Successfully");
		} else {
			model.addAttribute("messageResponse", "Password Changed not Successfully");
		}

		return "change_password";
	}

	@RequestMapping(path = "/delete", method = RequestMethod.GET)
	public String deleteEmloyee() {
		return "delete-employee";
	}

	@RequestMapping(path = "/delete", method = RequestMethod.POST)
	public String deleteEmployee(@RequestParam String id, Model model) {
		System.out.println(id);
		model.addAttribute("message", "Deleted successfully");
		return "delete-employee";
	}
}
