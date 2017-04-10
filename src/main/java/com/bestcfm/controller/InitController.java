package com.bestcfm.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
/**
 * 用于跳转的控制器
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
	 * 客户登录页面
	 * @return
	 */
	@RequestMapping("/toUserLogin")  
	public String toUserLogin() { 
	    return "userLogin";  
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
	 * 服务员页面
	 * @return
	 */
	@RequestMapping("/toWaiterCenter")  
	public String toWaiterCenter() { 
	    return "waiterCenter";  
	} 
	
	/**
	 * 员工登陆页面
	 * @return
	 */
	@RequestMapping("/toEmpLogin")  
	public String toEmpLogin() { 
	    return "empLogin";  
	} 
	
	/**
	 * 购物车
	 * @return
	 */
	@RequestMapping("/toShoppgingCar")  
	public String toShoppgingCar() { 
	    return "shoppingCar";  
	} 
	
	/**
	 * 分类
	 * @return
	 */
	@RequestMapping("/toFoodAssortment")  
	public String toFoodAssortment() { 
	    return "foodAssortment";  
	}
	
	/**
	 * 公告
	 * @return
	 */
	@RequestMapping("/toNotice")  
	public String toNotice() { 
	    return "notice";  
	}
	

}
