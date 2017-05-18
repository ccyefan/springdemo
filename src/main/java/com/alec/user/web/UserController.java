package com.alec.user.web;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.alec.user.domain.User;
import com.alibaba.fastjson.JSON;
@RestController
public class UserController {
	@RequestMapping("/user")
	public User getUser(){
		User user = new User();
		user.setId(2);
		user.setName("Kity");
		return user;
	}
	@RequestMapping("/user2")
	public String getFastJson(){
		User user1 = new User();
		user1.setId(3);
		user1.setName("Tomas");
		return JSON.toJSONString(user1);
	}
}
