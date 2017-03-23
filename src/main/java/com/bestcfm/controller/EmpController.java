package com.bestcfm.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.SessionAttributes;

import com.bestcfm.bean.Emp;
import com.bestcfm.service.EmpService;

@Controller
@RequestMapping("/emp")
@SessionAttributes("loginEmp")
public class EmpController {
	
	@Autowired
	private EmpService empService;
	
	@RequestMapping("/doLogin")
	public String doLogin(@RequestParam("phone")String phone,@RequestParam("empPassword")String empPassword,ModelMap map) {
		Emp loginEmp = empService.queryEmpByPhoneAndPassword(phone, empPassword);
		if(loginEmp == null){
			map.put("error", "用户名或密码错误");
			return "login";
		}
		else {
			map.put("loginEmp", loginEmp);
			int empRoot = loginEmp.getEmpRoot();
			if(empRoot == 0){
				return "cookCenter";
			}
			else if(empRoot == 1){
				return "waiterCenter";
			}
			else{
				return "adminCenter";
			}
		}	
	} 

}
