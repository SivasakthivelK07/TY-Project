package com.tyss.ems.contoller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@RequestMapping(path = "t1")
@Controller
public class EmsControllerT1 {

	@RequestMapping(path = "/welcome")
	public String welcome() {

		return "welcome";
	}
}
