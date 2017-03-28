package com.bestcfm.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.SessionAttributes;

import com.bestcfm.bean.User;
import com.bestcfm.service.UserService;

@Controller
@RequestMapping("/user")
@SessionAttributes("loginUser")
public class UserController {
	
	@Autowired
	private UserService userService;
	
	@RequestMapping("/doUserLogin")
	public String doEmpLogin(@RequestParam("phone")String phone,@RequestParam("userPassword")String userPassword,ModelMap map) {
		User loginUser = userService.queryUserByPhoneAndPassword(phone, userPassword);
		if(loginUser == null){
			map.put("error", "用户名或密码错误");
			return "userLogin";
		}
		map.put("loginUser", loginUser);
		return "customerCenter";
	} 

}
