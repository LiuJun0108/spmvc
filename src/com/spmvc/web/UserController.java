package com.spmvc.web;

import javax.annotation.Resource;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import com.spmvc.po.User;
import com.spmvc.service.IUserService;

@Controller
@RequestMapping("/user")
public class UserController {
	@Resource
	private IUserService userService;

	@RequestMapping(value = "/addUser", method = RequestMethod.GET)
	public String addUser() {
		System.out.println("UserController.addUser()");
		return "user/addUser";
	}

	@RequestMapping(value = "/addUser", method = RequestMethod.POST)
	public String addUser(User user) {
		System.out.println("UserController.addUser(User user)");
		userService.addUser(user);
		
		System.out.println("username = " + user.getUsername());
		System.out.println("password = " + user.getPassword());
		
		return "redirect:listUser.do";
	}

	@RequestMapping("/listUser")
	public String listUser(@RequestParam(value = "pageNo", defaultValue = "1") int pageNo, @RequestParam(value = "pageSize", defaultValue = "10") int pageSize) {
		System.out.println("UserController.listUser()");
		
		System.out.println("pageNo = " + pageNo);
		System.out.println("pageSize = " + pageSize);
		return "user/listUser";
	}
	
	@RequestMapping("/forword")
	public String forword() {
		return "forward:listUser.do";
	}
}