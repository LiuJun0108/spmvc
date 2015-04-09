package com.spmvc.web;

import java.util.Arrays;
import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.spmvc.po.User;

@Controller
@RequestMapping("/test")
public class TestController {
	private static final String OK = "ok";

	@RequestMapping("/method1")
	public String method1(@ModelAttribute("user") User user) {
		System.out.println("TestController.method1()");
		System.out.println(user.getUsername());
		return OK;
	}

	@ModelAttribute("cityList")
	public List<String> getCityList() {
		return Arrays.asList("北京", "山东");
	}

	@RequestMapping("/method2")
	public @ModelAttribute("user2") User method22(@ModelAttribute("user2") User user) {
		user.setUsername("method2");
		return user;
	}
	
	@ModelAttribute("bList")
	public List<User> getA() {
		return Arrays.asList(new User("a"), new User("b"));
	}
	
	@RequestMapping("/method3")
	@ResponseBody
	public String method3() {
		return "method3";
	}
	
	public String method4() {
		
		return OK;
	}
}
