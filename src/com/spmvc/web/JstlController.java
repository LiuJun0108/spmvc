package com.spmvc.web;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/jstl")
public class JstlController {
	private static final String JSTL = "jstl";
	private String username;

	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	@RequestMapping("/method1")
	public String method1(String username) {
		System.out.println("JstlController.method1()");

		username = "a";
		return JSTL;
	}

}
