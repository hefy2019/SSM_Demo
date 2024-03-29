package com.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import com.dao.UserDao;
import com.po.MyUser;
import com.service.UserService;

@Controller
public class UserController {
	@Autowired
	private UserService userService;
	@RequestMapping("/select")
	public String select(MyUser user, Model model) {
		List<MyUser> list=userService.selectUserByUname(user);
		model.addAttribute("userList",list);
		return "userList";
	}
}
