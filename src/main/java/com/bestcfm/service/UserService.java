package com.bestcfm.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.alibaba.fastjson.JSONObject;
import com.bestcfm.bean.User;
import com.bestcfm.bean.UserExample;
import com.bestcfm.dao.UserDao;
/**
 * 用户
 * @author cfm44850
 *
 */
@Service
public class UserService {
	
	@Autowired
	private UserDao userDao;
	
	public User queryUserByPhoneAndPassword(String phone,String userPassword){
		UserExample  example = new UserExample();
		UserExample.Criteria criteria = example.createCriteria();
		criteria.andPhoneEqualTo(phone);
		criteria.andUserPasswordEqualTo(userPassword);
		criteria.andDataFlagEqualTo(0);
		List<User> userList = userDao.selectByExample(example);
		User user = null;
		if(!userList.isEmpty()){
			user = userList.get(0);
		}
		System.out.println("UserService.queryUserByPhoneAndPassword:"+JSONObject.toJSONString(user));
		return user;
	}
}
