package com.bestcfm.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.alibaba.fastjson.JSONObject;
import com.bestcfm.bean.Emp;
import com.bestcfm.bean.EmpExample;
import com.bestcfm.dao.EmpDao;
/**
 * 员工表
 * @author cfm44850
 *
 */
@Service
public class EmpService {
	
	@Autowired
	private EmpDao empDao;
	
	public Emp queryEmpByPhoneAndPassword(String phone,String userPassword){
		EmpExample  example = new EmpExample();
		EmpExample.Criteria criteria = example.createCriteria();
		criteria.andPhoneEqualTo(phone);
		criteria.andEmpPasswordEqualTo(userPassword);
		criteria.andDataFlagEqualTo(0);
		List<Emp> userList = empDao.selectByExample(example);
		Emp emp = null;
		if(!userList.isEmpty()){
			emp = userList.get(0);
		}
		System.out.println("EmpService.queryEmpByPhoneAndPassword:"+JSONObject.toJSONString(emp));
		return emp;
	}
	
}
