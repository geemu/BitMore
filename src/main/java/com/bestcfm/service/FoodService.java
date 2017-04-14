package com.bestcfm.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.bestcfm.bean.Food;
import com.bestcfm.bean.FoodExample;
import com.bestcfm.dao.FoodDao;
import com.bestcfm.dao.custom.FoodDaoCustom;

/**
 * Author:陈方明
 * Email:cfmmail@sina.com
 * Created on 2017 	下午1:27:05
 */
@Service
public class FoodService {
	
	@Autowired
	private FoodDao foodDao;
	
	@Autowired
	private FoodDaoCustom foodDaoCustom;
	
	/**
	 * @return
	 */
	public List<Food> queryFavouriteFoodList(){
		FoodExample example = new FoodExample();
		FoodExample.Criteria criteria = example.createCriteria();
		criteria.andDataFlagEqualTo(0);
		example.setOrderByClause("sales Desc");
		return foodDao.selectByExample(example);
	}
	/**
	 * recommen设置为1的对象  小二推荐
	 * @return
	 */
	public List<Food> queryRecommendFoodList(){
		FoodExample example = new FoodExample();
		FoodExample.Criteria criteria  = example.createCriteria();
		criteria.andRecommendEqualTo(1);
		criteria.andDataFlagEqualTo(0);
		example.setOrderByClause("sales Desc");
		return foodDao.selectByExample(example);
	}
	/**
	 * 主键查询
	 * @param id
	 * @return
	 */
	public Food queryFoodByFoodId(int id){
		return foodDao.selectByPrimaryKey(id);
	}
	/**
	 * 根据用户关键字查询
	 * @param key
	 * @return
	 */
	public List<Food> queryFoodByKey(String key){
		return foodDaoCustom.selectByKey(key);
	}
	
	
}
