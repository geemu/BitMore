package com.bestcfm.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.alibaba.fastjson.JSONObject;
import com.bestcfm.bean.Emp;
import com.bestcfm.bean.EmpExample;
import com.bestcfm.dao.EmpDao;

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
		System.out.println(JSONObject.toJSONString(emp));
		return emp;
	}
	
	public boolean saveEmp(Emp emp){
		int result = 0;
		//更新
		if(emp.getId() > 0){
			result = empDao.updateByPrimaryKeySelective(emp);
		}
		//新增
		else{
			result = empDao.insertSelective(emp);
		}
		return result > 0;
	}
	
	public boolean deleteEmp(int id){
		Emp emp = new Emp();
		emp.setId(id);
		emp.setDataFlag(1);
		int result = empDao.updateByPrimaryKeySelective(emp);
		return result > 0;
	}
	
}
