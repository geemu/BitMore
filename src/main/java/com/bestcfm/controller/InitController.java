package com.bestcfm.controller;

import java.util.LinkedList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;

import com.bestcfm.bean.Food;
import com.bestcfm.service.FoodService;
/**
 * 用于跳转的控制器
 * @author cfm
 *
 */
@Controller
@RequestMapping("/skip")
public class InitController {
	@Autowired
	private FoodService foodService;
	
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
	public String toIndex(ModelMap map) { 
		List<Food> response = foodService.queryFavouriteFoodList();//食客最爱
		List<Food> favouriteFoodList = new LinkedList<>();//食客最爱
		if(response.size() >= 8){
			for(int i = 0;i<=7;i++){
				favouriteFoodList.add(response.get(i));
			}
		}
		else{
			for(int i = 0;i<response.size();i++){
				response.add(response.get(i));
			}
		}
		List<Food> recomendFoodList = foodService.queryRecommendFoodList();//小二推荐
		map.put("favouriteFoodList", favouriteFoodList);
		map.put("recomendFoodList", recomendFoodList);
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
	
	/**
	 * 空的首页
	 * @return
	 */
	@RequestMapping("/toEmptyHome")
	public String toEmptyHome(){
		return "emptyHome";
	}
	

}
