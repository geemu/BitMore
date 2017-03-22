package com.bestcfm.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.alibaba.fastjson.JSONObject;
import com.bestcfm.bean.User;
import com.bestcfm.bean.custom.ResponseBase;
import com.bestcfm.dao.UserDao;
@Service
public class UserService {
	
	@Autowired
	private UserDao userDao;
	
	public ResponseBase<User> queryUserByUserAccount(String userAccount) {
		ResponseBase<User> response = new ResponseBase<>();
		User user = new User();
		try {
			user = userDao.selectByPrimaryKey(userAccount);
		} catch (Exception e) {
			response.setIsSuccess(false);
			response.setErrorCode(1000);
			response.setError("数据库异常");
			response.setContent(null);
		}
		if(user == null){
			response.setIsSuccess(true);
			response.setErrorCode(1001);
			response.setError("用户账户不存在");
			response.setContent(null);
		}
		response.setIsSuccess(true);
		response.setErrorCode(null);
		response.setError(null);
		response.setContent(user);
		System.out.println(JSONObject.toJSONString(response));
		return response;
	} 

}
