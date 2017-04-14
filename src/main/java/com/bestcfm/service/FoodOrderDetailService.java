package com.bestcfm.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.bestcfm.bean.Food;
import com.bestcfm.bean.FoodOrderDetail;
import com.bestcfm.bean.FoodOrderDetailExample;
import com.bestcfm.dao.FoodOrderDetailDao;

/**
 * Author:陈方明
 * Email:cfmmail@sina.com
 * Created on 2017 	下午3:15:23
 */
@Service
public class FoodOrderDetailService {
	
	@Autowired
	private FoodOrderDetailDao foodOrderDetailDao;
	
	@Autowired
	private FoodService foodService;
	/**
	 * 根据用户编号查询用户的购物车信息
	 * @param userId
	 * @return
	 */
	public List<FoodOrderDetail> queryFoodOrderDetailListByUserId(int userId){
		FoodOrderDetailExample example = new FoodOrderDetailExample();
		FoodOrderDetailExample.Criteria criteria = example.createCriteria();
		criteria.andDataFlagEqualTo(0);
		criteria.andUserIdEqualTo(userId);
		criteria.andOrderStateEqualTo(0);
		return foodOrderDetailDao.selectByExample(example);
	}
	/**
	 * 添加单件菜品进购物车
	 * @param foodId
	 * @param userId
	 * @return
	 */
	public boolean doAddShoppingCar(int foodId,int userId){
		//查询当前添加菜品的价格信息等
		Food food = foodService.queryFoodByFoodId(foodId);
		//先查询当前菜品是否已经存在于购物车
		FoodOrderDetailExample example = new FoodOrderDetailExample();
		FoodOrderDetailExample.Criteria criteria = example.createCriteria();
		criteria.andDataFlagEqualTo(0);
		criteria.andFoodIdEqualTo(foodId);
		criteria.andUserIdEqualTo(userId);
		List<FoodOrderDetail> FoodOrderDetailList = foodOrderDetailDao.selectByExample(example);
		if(FoodOrderDetailList.isEmpty() || FoodOrderDetailList.size() <= 0){
			//不存在	直接新增
			FoodOrderDetail record = new FoodOrderDetail();
			record.setUserId(userId);
			record.setFoodId(foodId);
			record.setOrderCount(1);
			record.setSinglePrice(food.getPrice());
			record.setFoodName(food.getFoodName());
			record.setTotal(food.getPrice());
			return foodOrderDetailDao.insertSelective(record)>0 ? true:false;
			
		}
		else{
			//已经存在 更新
			FoodOrderDetail FoodOrderDetail = FoodOrderDetailList.get(0);//需要更新的对象
			FoodOrderDetail record = new FoodOrderDetail();
			record.setId(FoodOrderDetail.getId());
			record.setOrderCount(FoodOrderDetail.getOrderCount()+1);
			record.setTotal(FoodOrderDetail.getSinglePrice()+FoodOrderDetail.getTotal());
			return foodOrderDetailDao.updateByPrimaryKeySelective(record)>0 ? true:false;
		}
	}
	/**
	 * 操作购物车
	 * @param operateId
	 * @param userId
	 * @param operate
	 * @return
	 */
	public boolean operateCar( int operateId,int userId,int operate){
		//查询当前操作的菜品
		FoodOrderDetail foodfoodOrderDetail = foodOrderDetailDao.selectByPrimaryKey(operateId);
		int num = foodfoodOrderDetail.getOrderCount();
		if(num <= 1 && operate == -1){
			FoodOrderDetail record = new FoodOrderDetail();
			record.setId(operateId);
			record.setOrderCount(0);
			record.setDataFlag(1);
			return foodOrderDetailDao.updateByPrimaryKeySelective(record) > 0 ?true:false;
		}
		else{
			FoodOrderDetail record = new FoodOrderDetail();
			record.setId(operateId);
			record.setOrderCount(num+operate);
			return foodOrderDetailDao.updateByPrimaryKeySelective(record) > 0 ?true:false;
		}
	}

}
