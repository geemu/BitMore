package com.bestcfm.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
/**
 * 初始化的控制器  即用于跳转的控制器
 * @author cfm
 *
 */
@Controller
@RequestMapping("/skip")
public class InitController {
	
	/**
	 * 初始页面
	 * @return
	 */
	@RequestMapping("/init")  
	public String init() { 
	    return "init";  
	} 
	
	/**
	 * 管理员中心
	 * @return
	 */
	@RequestMapping("/toAdminCenter")
	public String toAdminCenter(){
		return "adminCenter";
	}
	
	/**
	 * 厨师中心
	 * @return
	 */
	@RequestMapping("/toCookCenter")
	public String toCookCenter(){
		return "cookCenter";
	}
	
	/**
	 * 客户中心
	 * @return
	 */
	@RequestMapping("/toCustomerCenter")
	public String toCustomerCenter(){
		return "customerCenter";
	}
	
	/**
	 * 首页
	 * @return
	 */
	@RequestMapping("/toIndex")  
	public String toIndex() { 
	    return "index";  
	} 
	
	/**
	 * 登录页面
	 * @return
	 */
	@RequestMapping("/toLogin")  
	public String toLogin() { 
	    return "login";  
	} 
	
	/**
	 * 注册成功页面
	 * @return
	 */
	@RequestMapping("/torToRegisterOk")  
	public String torToRegisterOk() { 
	    return "register_ok";  
	} 
	
	/**
	 * 注册页面
	 * @return
	 */
	@RequestMapping("/toRegister")  
	public String toRegister() { 
	    return "register";  
	} 
	
	/**
	 * 注册页面
	 * @return
	 */
	@RequestMapping("/toWaiterCenter")  
	public String toWaiterCenter() { 
	    return "waiterCenter";  
	} 
	
	

}
