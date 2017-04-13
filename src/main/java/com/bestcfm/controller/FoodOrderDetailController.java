package com.bestcfm.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import com.bestcfm.service.FoodOrderDetailService;

/**
 * Author:陈方明
 * Email:cfmmail@sina.com
 * Created on 2017 	下午3:24:46
 */

@Controller
@RequestMapping("/foodOrderDetail")
public class FoodOrderDetailController {
	 @Autowired
	 private FoodOrderDetailService  foodOrderDetailService;
	 
	 @RequestMapping("/shoppingCar")
	 public String ShoppingCar(@RequestParam("userId") int userId,ModelMap map){
		map.put("myShoppingCarFoodList",foodOrderDetailService.queryFoodOrderDetailListByUserId(userId));
		return "shoppingCar";	 
	 }
	 
	 @RequestMapping("/doAddShoppingCar")
	 @ResponseBody
	 public String doAddShoppingCar(@RequestParam("foodId") int foodId,@RequestParam("userId") int userId){
		 boolean result = foodOrderDetailService.doAddShoppingCar(foodId, userId);
		 String data = result == true?"添加成功":"添加失败";
		 return data;
	 }
}
