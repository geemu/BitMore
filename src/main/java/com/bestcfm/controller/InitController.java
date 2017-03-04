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
	 * 登录页面
	 * @return
	 */
	@RequestMapping("/toLogin")  
	public String toLogin() { 
	    return "login";  
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
	 * 主页面
	 * @return
	 */
	@RequestMapping("/toIndex")  
	public String toIndex() { 
	    return "index";  
	} 

}
