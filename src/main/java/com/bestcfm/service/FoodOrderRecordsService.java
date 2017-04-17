package com.bestcfm.service;

import java.util.Date;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.bestcfm.bean.FoodOrderRecords;
import com.bestcfm.dao.FoodOrderRecordsDao;
import com.bestcfm.util.OrderUtil;
import com.bestcfm.util.TimeUtil;

/**
 * Author:陈方明
 * Email:cfmmail@sina.com
 * Created on 2017 	下午4:54:46
 */
@Service
public class FoodOrderRecordsService {
	
	@Autowired
	private FoodOrderRecordsDao foodOrderRecordsDao;
	
	/**
	 * 新增订单
	 * @param userId
	 * @param deskNum
	 * @return
	 */
	public int createNewRecords(int userId,int deskNum){
		String orderNum = OrderUtil.getOrderNumber();
		FoodOrderRecords record = new FoodOrderRecords();
		record.setDeskNo(deskNum);
		record.setUserId(userId);
		record.setRecordsNo(orderNum);
		record.setCreateTime(TimeUtil.convertCurrentTimeToDateType());
		record.setUpdateTime(new Date());
		foodOrderRecordsDao.insertSelective(record);
		return record.getId();
	}

}
