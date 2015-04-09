package com.spmvc.web;

import java.util.Arrays;
import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.spmvc.po.User;

@Controller
@RequestMapping("/json")
public class JsonController {

	@RequestMapping("/method1")
	public User method1(User user) {
		System.out.println("JsonController.method1()");

		user.setUserId(1);
		user.setUsername("a");
		user.setPassword("a");
		user.setAge(1);
		return user;
	}

	@RequestMapping("/method2")
	@ResponseBody()
	public List<User> method2() {
		System.out.println("JsonController.method2()");

		return Arrays.asList(new User("a"), new User("b"));
	}
}
