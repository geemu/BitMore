package com.bestcfm.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.SessionAttributes;

import com.bestcfm.bean.User;
import com.bestcfm.service.UserService;
import com.bestcfm.util.Sendsms;

@Controller
@RequestMapping("/user")
@SessionAttributes({"loginUser","code","registerPhone"})
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
		map.remove("error");
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
	public String doUserRegister(@RequestParam("username")String phone,@RequestParam("password")String password,@RequestParam("validateCode") int validateCode,ModelMap map) {
		User user = userService.queryUserByPhone(phone);
		if(user != null){
			return "该用户已被注册";
		}
		if(map.get("code") == null){
			return "请先获取验证码";
		}
		if(Integer.parseInt(map.get("code").toString()) != validateCode){
			return "验证码错误";
		}
		if(!map.get("registerPhone").toString().equals(phone)){
			return "手机号错误";
		}
		
		int response = userService.addNewUser(phone, password);
		if(response > 0){
			User loginUser = userService.queryUserById(response);//查询最新的对象，放至进session进行登录
			map.put("loginUser", loginUser);
			return "";
		}
		else{
			return "网络异常注册失败";
		}
		
	}
	/**
	 * 获取手机验证码
	 * @return
	 */
	@RequestMapping("/ajaxGetVerifyCode")
	@ResponseBody
	public String ajaxGetVerifyCode(@RequestParam("username")String registerPhone,ModelMap map) {
		int validateCode = Sendsms.getPhoneValidateCode(registerPhone);
		//判断当前用户是否已经注册
		User user = userService.queryUserByPhone(registerPhone);
		if(user != null){
			return "该用户已被注册";
		}
		//未注册
		else{
			map.put("code", validateCode);//验证码
			map.put("registerPhone", registerPhone);//验证码对应的手机号
			return "";
		}	
	}
	/**
	 * 用户注销
	 * @param map
	 * @return
	 */
	@RequestMapping("/zhuxiao")
	public String empZhuXiao(ModelMap map){
		System.out.println("用户注销");
		map.remove("loginUser");
		return "userLogin";
	}

}
