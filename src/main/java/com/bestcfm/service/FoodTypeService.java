package com.bestcfm.service;

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
	
	public List<FoodType> queryAllFoodType(){
		FoodTypeExample example = new FoodTypeExample();
		FoodTypeExample.Criteria criteria = example.createCriteria();
		criteria.andDataFlagEqualTo(0);
		return foodTypeDao.selectByExample(example);
	}
}
