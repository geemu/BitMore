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
		example.setOrderByClause("sales desc,id Desc");
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
	/**
	 * 添加菜品
	 * @param food
	 * @return
	 */
	public int addNewFood(Food food){
		return foodDao.insertSelective(food) > 0?food.getId():0;
	}
	/**
	 * 更新菜品
	 * @param food
	 * @return
	 */
	public boolean updateFood(Food food){
		return foodDao.updateByPrimaryKeySelective(food)>0?true:false;
	}
	/**
	 * 查询所有菜品
	 * @return
	 */
	public List<Food> queryAllFood(){
		FoodExample exmaple = new FoodExample();
		exmaple.setOrderByClause("id desc");
		FoodExample.Criteria criteria = exmaple.createCriteria();
		criteria.andDataFlagEqualTo(0);
		return foodDao.selectByExample(exmaple);
	}
	/**
	 * 根据类别搜索
	 * @param id
	 * @return
	 */
	public List<Food> leibiesousu(int id){
		FoodExample exmaple = new FoodExample();
		FoodExample.Criteria criteria = exmaple.createCriteria();
		criteria.andDataFlagEqualTo(0);
		criteria.andTypeIdEqualTo(id);
		return foodDao.selectByExample(exmaple);
	}
	
}
