package com.bestcfm.controller;

import java.io.UnsupportedEncodingException;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.SessionAttributes;

import com.bestcfm.bean.User;
import com.bestcfm.service.UserService;
import com.bestcfm.util.Sendsms;

@Controller
@RequestMapping("/user")
@SessionAttributes({"loginUser","validateCode"})
public class UserController {
	
	@Autowired
	private UserService userService;
	/**
	 * 用户登录
	 * @param phone
	 * @param userPassword
	 * @param map
	 * @return
	 */
	@RequestMapping("/doUserLogin")
	public String doUserLogin(@RequestParam("phone")String phone,@RequestParam("userPassword")String userPassword,ModelMap map) {
		User loginUser = userService.queryUserByPhoneAndPassword(phone, userPassword);
		if(loginUser == null){
			map.put("error", "用户名或密码错误");
			return "userLogin";
		}
		map.put("loginUser", loginUser);
		return "customerCenter";
	}
	/**
	 * 用户注册
	 * @param phone
	 * @param userPassword
	 * @param map
	 * @return
	 */
	@RequestMapping("/doUserRegister")
	@ResponseBody
	public void doUserRegister(@RequestParam("username")String registerPhone,@RequestParam("password")String password,@RequestParam("validateCode")String validateCode,ModelMap map) {
		User user = userService.queryUserByPhone(registerPhone);
		if(user != null){
			map.put("error", "该用户已被注册");
			System.out.println("该用户已被注册");
		}
		
		int response = userService.addNewUser(registerPhone, password);
		if(response > 0){
			User loginUser = userService.queryUserById(response);
			map.put("loginUser", loginUser);
		}
		else{
			map.put("error", "注册失败");
		}
		
	}
	/**
	 * 获取手机验证码
	 * @return
	 */
	@RequestMapping("/ajaxGetVerifyCode")
	@ResponseBody
	public String ajaxGetVerifyCode(@RequestParam("username")String registerPhone,ModelMap map) {
		//int validateCode = Sendsms.getPhoneValidateCode(userName);
		int validateCode = 1111;
		//判断当前用户是否已经注册
		User user = userService.queryUserByPhone(registerPhone);
		//已经注册
		if(user != null){
			System.out.println("该用户已被注册");
			return "该用户已被注册";
		}
		//未注册
		else{
			map.put("validateCode", validateCode);//验证码
			map.put("registerPhone", registerPhone);//验证码对应的手机号
			return null;
		}
		
		
	}

}
