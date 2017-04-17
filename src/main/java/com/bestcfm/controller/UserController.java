package com.bestcfm.controller;

import java.util.LinkedList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.SessionAttributes;

import com.bestcfm.bean.Food;
import com.bestcfm.bean.User;
import com.bestcfm.service.FoodService;
import com.bestcfm.service.UserService;
import com.bestcfm.util.Sendsms;

@Controller
@RequestMapping("/user")
@SessionAttributes({"loginUser","code","registerPhone"})
public class UserController {
	
	@Autowired
	private UserService userService;
	
	@Autowired
	private FoodService foodService;
	
	/**
	 * 公告
	 * @return
	 */
	@RequestMapping("/toNotice")  
	public String toNotice() { 
	    return "notice";  
	}
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
		//int validateCode = Sendsms.getPhoneValidateCode(registerPhone);
		int validateCode = 2222; 
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
	public String userZhuXiao(ModelMap map){
		map.remove("loginUser");
		return "userLogin";
	}
	
	/**
	 * 客户中心
	 * @return
	 */
	@RequestMapping("/toCustomerCenter")
	public String toCustomerCenter(ModelMap map){
		if(map.get("loginUser") == null){
			return "userLogin";
		}
		return "customerCenter";
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
	 * 首页
	 * @return
	 */
	@RequestMapping("/toIndex")  
	public String toIndex(ModelMap map) {
		System.out.println("用户主页");
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

}
