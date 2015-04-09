package com.spmvc.service;

import org.springframework.stereotype.Service;

import com.spmvc.po.User;

@Service
public class UserServiceImpl implements IUserService {

	@Override
	public void addUser(User user) {
		System.out.println("UserServiceImpl.addUser()");
	}

}
