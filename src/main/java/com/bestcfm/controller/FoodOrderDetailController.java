package com.bestcfm.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.SessionAttributes;

import com.bestcfm.bean.FoodOrderDetail;
import com.bestcfm.bean.User;
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
		int userId = loginUser.getId();
		int money = foodOrderDetailService.sumMoney(userId);
		if (money > 0) {
			map.put("money", money + " ￥");
		}
		boolean result = foodOrderDetailService.doAddShoppingCar(foodId, userId);
		String data = result == true ? "添加成功" : "添加失败";
		return data;
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
		int money = foodOrderDetailService.sumMoney(userId);
		if (money > 0) {
			map.put("money", money + " ￥");
		}
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
		System.out.println("needToSend");
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
		System.out.println("needToCook");
		List<FoodOrderDetail> needToCookFoodList = foodOrderDetailService.cookCenter();
		for (int i = 0; i < needToCookFoodList.size(); i++) {
			needToCookFoodList.get(i).setCreateTime(TimeUtil.convertParamDateTypeToDateOnlyDay(needToCookFoodList.get(i).getCreateTime()));
		}
		map.put("needToCookFoodList", needToCookFoodList);
		return "needToCook";
	}
}
