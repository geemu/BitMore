package com.bestcfm.controller;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.LinkedList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.format.annotation.DateTimeFormat;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.SessionAttributes;

import com.alibaba.fastjson.JSONArray;
import com.alibaba.fastjson.JSONObject;
import com.bestcfm.bean.FoodOrderDetail;
import com.bestcfm.bean.User;
import com.bestcfm.bean.custom.AggregationPoJo;
import com.bestcfm.bean.custom.EchartsConfig;
import com.bestcfm.service.FoodOrderDetailService;
import com.bestcfm.util.TimeUtil;

/**
 * Author:陈方明 Email:cfmmail@sina.com Created on 2017 下午3:24:46
 */

@Controller
@SessionAttributes("loginUser")
@RequestMapping("/foodOrderDetail")
public class FoodOrderDetailController {
	@Autowired
	private FoodOrderDetailService foodOrderDetailService;

	/**
	 * 进入购物车
	 * 
	 * @param userId
	 * @param map
	 * @return
	 */
	@RequestMapping("/shoppingCar")
	public String ShoppingCar(ModelMap map) {
		User loginUser = (User) map.get("loginUser");
		if(loginUser == null){
			return "userLogin";
		}
		int userId = loginUser.getId();
		List<FoodOrderDetail> FoodOrderDetailList = foodOrderDetailService.queryFoodOrderDetailListByUserId(userId);
		int money = foodOrderDetailService.sumMoney(userId);
		if (money > 0) {
			map.put("money", money + " ￥");
		}
		map.put("myShoppingCarFoodList", FoodOrderDetailList);
		return "shoppingCar";
	}

	/**
	 * 加入购物车
	 * 
	 * @param foodId
	 * @param map
	 * @return
	 */
	@RequestMapping("/doAddShoppingCar")
	@ResponseBody
	public String doAddShoppingCar(@RequestParam("foodId") int foodId, ModelMap map) {
		User loginUser = (User) map.get("loginUser");
		if(loginUser == null){
			return "userLogin";
		}
		int userId = loginUser.getId();
		return foodOrderDetailService.doAddShoppingCar(foodId, userId)==true?"加入成功":"加入失败";
	}

	/**
	 * 操作购物车
	 * 
	 * @param operateId
	 * @param userId
	 * @param operate
	 * @return
	 */
	@RequestMapping("/operateCar")
	@ResponseBody
	public String operateCar(ModelMap map, @RequestParam("operateId") int operateId,
			@RequestParam("operate") int operate) {
		User loginUser = (User) map.get("loginUser");
		int userId = loginUser.getId();
		boolean result = foodOrderDetailService.operateCar(operateId, userId, operate);
		String data = result == true ? "操作成功" : "操作失败";
		return data;
	}

	/**
	 * 支付
	 * 
	 * @param map
	 * @param deskNum
	 * @return
	 */
	@RequestMapping("/doPay")
	@ResponseBody
	public String doPay(ModelMap map, @RequestParam("deskNum") int deskNum) {
		User loginUser = (User) map.get("loginUser");
		return foodOrderDetailService.doPay(loginUser.getId(), deskNum) == true ? "支付成功" : "支付失败";
	}

	/**
	 * 需要派送的列表
	 * 
	 * @return
	 */
	@RequestMapping("/needToSend")
	public String needToSend(ModelMap map) {
		List<FoodOrderDetail> needToSendFoodList = foodOrderDetailService.cookCenter();
		for (int i = 0; i < needToSendFoodList.size(); i++) {
			needToSendFoodList.get(i).setCreateTime(TimeUtil.convertParamDateTypeToDateOnlyDay(needToSendFoodList.get(i).getCreateTime()));
		}
		map.put("needToSendFoodList", needToSendFoodList);
		return "needToSend";
	}

	/**
	 * 需要制作的列表
	 * 
	 * @return
	 */
	@RequestMapping("/needToCook")
	public String needToCook(ModelMap map) {
		List<FoodOrderDetail> needToCookFoodList = foodOrderDetailService.cookCenter();
		for (int i = 0; i < needToCookFoodList.size(); i++) {
			needToCookFoodList.get(i).setCreateTime(TimeUtil.convertParamDateTypeToDateOnlyDay(needToCookFoodList.get(i).getCreateTime()));
		}
		map.put("needToCookFoodList", needToCookFoodList);
		return "needToCook";
	}
	/**
	 * 派送
	 * @param map
	 * @param id
	 * @return
	 */
	@RequestMapping("/paiSongFood")
	@ResponseBody
	public String paiSongFood(ModelMap map,@RequestParam("id") int id) {
		return foodOrderDetailService.paisong(id)==true?"派送成功":"派送失败";
	}
	
	/**
	 * echarts
	 * @return
	 */
	@RequestMapping("/echarts")  
	public String echarts() { 
		System.out.println("echarts");
	    return "echarts";  
	} 
	
	/**
	 * doEcharts
	 * @return
	 */
	@RequestMapping("/doEcharts") 
	@ResponseBody
	public String doEcharts(@RequestParam("startTime")@DateTimeFormat(pattern="yyyy-MM-dd HH") Date startTime,@RequestParam("endTime")@DateTimeFormat(pattern="yyyy-MM-dd HH") Date endTime ) { 
		if(startTime == null || endTime == null){
			try {
				startTime = new  SimpleDateFormat("yyyy-MM-dd HH").parse("1970-01-01 00");
			} catch (ParseException e) {
				e.printStackTrace();
			}
			endTime = new Date();
		}
		if(startTime.after(endTime)){
			Date temp = endTime;
			endTime = startTime;
			startTime = temp;
		}
		String s = new SimpleDateFormat("yyyy-MM-dd HH").format(startTime);
		String e = new SimpleDateFormat("yyyy-MM-dd HH").format(endTime);
		String titleText = s+" 时   至  "+e+" 时 销售额统计";
		List<AggregationPoJo> aggregationPojoList = foodOrderDetailService.aggregationByTime(startTime,endTime);
	    System.out.println(aggregationPojoList);
	    EchartsConfig config = new EchartsConfig();
	    config.setTitleText(titleText);
	    List<String> xAxisData = new LinkedList<>();
	    List<Integer> yAxisData = new LinkedList<>();
	    for(int i = 0;i<aggregationPojoList.size();i++){
	    	xAxisData.add(aggregationPojoList.get(i).getXAxis());//日期
	    	yAxisData.add(aggregationPojoList.get(i).getYAxis());//销售额
	    }
	    config.setXAxisData(xAxisData);
	    config.setYAxisData(yAxisData);
	    String response = JSONObject.toJSONString(config);
		return response;  
	}
	
}
