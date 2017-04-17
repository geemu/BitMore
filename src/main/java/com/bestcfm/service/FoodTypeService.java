package com.bestcfm.service;

import java.util.Date;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.bestcfm.bean.FoodType;
import com.bestcfm.bean.FoodTypeExample;
import com.bestcfm.dao.FoodTypeDao;

/**
 * Author:陈方明
 * Email:cfmmail@sina.com
 * Created on 2017 	下午5:57:38
 */
@Service
public class FoodTypeService {

	@Autowired
	private FoodTypeDao foodTypeDao;
	/**
	 * 查询所有菜品类别
	 * @return
	 */
	public List<FoodType> queryAllFoodType(){
		FoodTypeExample example = new FoodTypeExample();
		FoodTypeExample.Criteria criteria = example.createCriteria();
		criteria.andDataFlagEqualTo(0);
		return foodTypeDao.selectByExample(example);
	}
	/**
	 * 根据id查询
	 * @param id
	 * @return
	 */
	public FoodType queryFoodTypeById(int id){
		return foodTypeDao.selectByPrimaryKey(id);
	}
	/**
	 * 添加类别
	 * @param typeName
	 * @return
	 */
	public boolean addNewFoodType(String typeName){
		FoodType record = new FoodType();
		record.setCreateTime(new Date());
		record.setTypeName(typeName);
		return foodTypeDao.insertSelective(record)>0?true:false;
	}
}
