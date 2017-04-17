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
	
	/**
	 * 员工登陆页面
	 * @return
	 */
	@RequestMapping("/toEmpLogin")  
	public String toEmpLogin() { 
	    return "empLogin";  
	} 
	/**
	 * 员工登录
	 * @param phone
	 * @param empPassword
	 * @param map
	 * @return
	 */
	@RequestMapping("/doEmpLogin")
	public String doEmpLogin(@RequestParam("phone")String phone,@RequestParam("empPassword")String empPassword,ModelMap map) {
		Emp loginEmp = empService.queryEmpByPhoneAndPassword(phone, empPassword);
		if(loginEmp == null){
			return "empLogin";
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
			else if(empRoot == 2){
				return "adminCenter";
			}
			else{
				return "empLogin";
			}
		}	
	} 
	/**
	 * 员工注销
	 * @param map
	 * @return
	 */
	@RequestMapping("/zhuxiao")
	public String empZhuXiao(ModelMap map){
		map.remove("loginEmp");
		return "empLogin";
	}

}
