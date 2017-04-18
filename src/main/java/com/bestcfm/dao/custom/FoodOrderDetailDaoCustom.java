package com.bestcfm.dao.custom;

import java.util.Date;
import java.util.List;

import org.apache.ibatis.annotations.Param;

import com.bestcfm.bean.custom.AggregationPoJo;

/**
 * Author:陈方明
 * Email:cfmmail@sina.com
 * Created on 2017 	下午2:28:10
 */
public interface FoodOrderDetailDaoCustom {
	/**
	 * 根据时间聚合
	 * @param startTime
	 * @param endTime
	 * @return
	 */
	List<AggregationPoJo> aggregationByTime(@Param("startTime")Date startTime,@Param("endTime")Date endTime);
}
