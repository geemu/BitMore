package com.bestcfm.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.bestcfm.bean.Emp;
import com.bestcfm.bean.EmpExample;
import com.bestcfm.dao.EmpDao;
/**
 * 
 * Author:陈方明
 * Email:cfmmail@sina.com
 * Created on 2017 	下午2:07:59
 */
@Service
public class EmpService {
	
	@Autowired
	private EmpDao empDao;
	
	public Emp queryEmpByPhoneAndPassword(String phone,String empPassword){
		EmpExample  example = new EmpExample();
		EmpExample.Criteria criteria = example.createCriteria();
		criteria.andPhoneEqualTo(phone);
		criteria.andEmpPasswordEqualTo(empPassword);
		criteria.andDataFlagEqualTo(0);
		List<Emp> empList = empDao.selectByExample(example);
		Emp emp = null;
		if(!empList.isEmpty()){
			emp = empList.get(0);
		}
		return emp;
	}
	
}
