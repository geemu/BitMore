package com.bestcfm.service;

import java.util.Date;
import java.util.LinkedList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.bestcfm.bean.Food;
import com.bestcfm.bean.FoodOrderDetail;
import com.bestcfm.bean.FoodOrderDetailExample;
import com.bestcfm.bean.custom.AggregationPoJo;
import com.bestcfm.dao.FoodOrderDetailDao;
import com.bestcfm.dao.custom.FoodOrderDetailDaoCustom;
import com.bestcfm.util.TimeUtil;

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
	 private FoodOrderRecordsService  foodOrderRecordsService;
	
	@Autowired
	private FoodService foodService;
	
	@Autowired
	private FoodOrderDetailDaoCustom foodOrderDetailDaoCustom;
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
		criteria.andOrderCountGreaterThanOrEqualTo(1);
		criteria.andRecordsIdEqualTo(0);
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
		criteria.andOrderCountGreaterThanOrEqualTo(1);
		criteria.andOrderStateEqualTo(0);
		criteria.andRecordsIdEqualTo(0);
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
			record.setTotal(0);
			return foodOrderDetailDao.updateByPrimaryKeySelective(record) > 0 ?true:false;
		}
		else{
			FoodOrderDetail record = new FoodOrderDetail();
			record.setId(operateId);
			record.setOrderCount(num+operate);
			record.setTotal(foodfoodOrderDetail.getTotal()+foodfoodOrderDetail.getSinglePrice()*operate);
			return foodOrderDetailDao.updateByPrimaryKeySelective(record) > 0 ?true:false;
		}
	}
	/**
	 * 支付
	 * @param userId
	 * @return
	 */
	@Transactional
	public boolean doPay(int userId,int deskNum){
		//先根据用户编号查询状态为购物车的订单
		FoodOrderDetailExample example = new FoodOrderDetailExample();
		FoodOrderDetailExample.Criteria criteria = example.createCriteria();
		criteria.andDataFlagEqualTo(0);
		criteria.andOrderCountGreaterThanOrEqualTo(1);
		criteria.andUserIdEqualTo(userId);
		criteria.andOrderStateEqualTo(0);
		criteria.andRecordsIdEqualTo(0);
		List<FoodOrderDetail> existList = foodOrderDetailDao.selectByExample(example);
		if(existList.isEmpty() || existList.size()<= 0){
			return false;
		}
		else{
			//找出所有的主键
			List<Integer> idList = new LinkedList<>();
			for(int i = 0 ;i < existList.size();i++ ){
				idList.add(existList.get(i).getId());
			}
			//先生成总的订单
			int recordsId = foodOrderRecordsService.createNewRecords(userId, deskNum);
			//更新所有订单为支付成功 并把主表主键写入
			for(int i = 0 ;i < existList.size();i++){
				FoodOrderDetail record = new FoodOrderDetail();
				record.setRecordsId(recordsId);
				record.setOrderState(4);
				record.setId(existList.get(i).getId());
				record.setDeskNo(deskNum);
				record.setCreateTime(TimeUtil.convertCurrentTimeToDateType());
				record.setUpdateTime(new Date());
				int result = foodOrderDetailDao.updateByPrimaryKeySelective(record);
				if(result <= 0){
					try {
						throw new Exception("支付失败");
					} catch (Exception e) {
						e.printStackTrace();
					}
				}
			}
		}
		return true;	
	}
	
	/**
	 * 计算总价
	 * @param userId
	 * @return
	 */
	public int sumMoney(int userId){
		FoodOrderDetailExample example = new FoodOrderDetailExample();
		FoodOrderDetailExample.Criteria criteria = example.createCriteria();
		criteria.andDataFlagEqualTo(0);
		criteria.andUserIdEqualTo(userId);
		criteria.andOrderStateEqualTo(0);
		criteria.andOrderCountGreaterThanOrEqualTo(1);
		criteria.andRecordsIdEqualTo(0);
		List<FoodOrderDetail> foodOrderDetailList = foodOrderDetailDao.selectByExample(example);
		int sum = 0;
		for(FoodOrderDetail e:foodOrderDetailList){
			sum += e.getTotal();
		}
		return sum;
	}
	/**
	 * 查询需要制作的菜品
	 * @return
	 */
	public List<FoodOrderDetail> cookCenter(){
		FoodOrderDetailExample example = new FoodOrderDetailExample();
		example.setOrderByClause("id asc");
		FoodOrderDetailExample.Criteria criteria = example.createCriteria();
		criteria.andDataFlagEqualTo(0);
		criteria.andOrderStateEqualTo(4);
		criteria.andOrderCountGreaterThanOrEqualTo(1);
		criteria.andRecordsIdNotEqualTo(0);
		return foodOrderDetailDao.selectByExample(example);
	}
	/**
	 * 派送菜品
	 */
	public boolean paisong(int id){
		FoodOrderDetail record = new FoodOrderDetail();
		record.setId(id);
		record.setUpdateTime(new Date());
		record.setOrderState(5);
		return foodOrderDetailDao.updateByPrimaryKeySelective(record)>0?true:false;
	}
	
	/**
	 * 根据时间聚合
	 * @param startTime
	 * @param endTime
	 * @return
	 */
	public List<AggregationPoJo> aggregationByTime(Date startTime,Date endTime){
		List<AggregationPoJo> aggregationPojoList = foodOrderDetailDaoCustom.aggregationByTime(startTime,endTime);
		return aggregationPojoList;
	}

}
