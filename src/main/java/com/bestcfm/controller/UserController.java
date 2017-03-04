package com.bestcfm.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.bestcfm.bean.User;
import com.bestcfm.dao.UserDao;
/**
 * 用户的控制器
 * @author cfm
 *
 */
@Controller
@RequestMapping("/user")
public class UserController {
	
	@Autowired
	private UserDao userDao;
	
	/**
	 * 初始页面
	 * @return
	 */
	@RequestMapping("/doLogin")  
	public String doLogin(@RequestParam("username")String userAccount,@RequestParam("password")String password) {
		//返回视图
		String jsp = null;
		System.out.println("用户名："+userAccount+"-用户密码："+password);
		System.out.println();
		User loginUser = new User();
		//数据库查询出来的对象
		loginUser = userDao.selectByPrimaryKey(userAccount);
		//用户名不存在
		if(loginUser == null){
			jsp = "login";
		}
		//用户名存在
		else{
			//密码正确
			if(loginUser.getUserPassword().equals(password)){
				//将用户存入session	判断用户权限	用户权限；0为会员，1为厨师，2为服务员，3为管理员
				int userRoot = loginUser.getUserRoot();
				switch (userRoot) {
				case 0:
					jsp = "customerCenter";
					break;
				case 1:
					jsp = "cookCenter";
					break;
				case 2:
					jsp = "waiterCenter";
					break;
				case 3:
					jsp = "adminCenter";
					break;
				default:
					jsp = "customerCenter";
					break;
				}
			}
			//密码错误
			else{
				jsp = "login";
			}
		}
	    return jsp;  
	} 
	
	

}
