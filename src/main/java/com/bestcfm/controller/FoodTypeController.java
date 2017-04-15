package com.bestcfm.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;

import com.bestcfm.bean.FoodType;
import com.bestcfm.service.FoodTypeService;

/**
 * Author:陈方明
 * Email:cfmmail@sina.com
 * Created on 2017 	下午6:02:45
 */
@RequestMapping("/foodType")
public class FoodTypeController {
	 @Autowired
	 private FoodTypeService foodTypeService;
	 
	 @RequestMapping("/allFoodType")
	 public String foodType(ModelMap map){
		List<FoodType> allFoodTypeList = foodTypeService.queryAllFoodType();
		map.put("allFoodTypeList", allFoodTypeList);
		return null; 
	 }
}
