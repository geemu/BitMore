package com.bestcfm.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import com.bestcfm.bean.Food;
import com.bestcfm.service.FoodService;

/**
 * Author:陈方明
 * Email:cfmmail@sina.com
 * Created on 2017 	下午7:38:00
 */
@Controller
@RequestMapping("/food")
public class FoodController {
	
	@Autowired
	private FoodService foodService;
	/**
	 * 用户搜索
	 * @param key
	 * @param map
	 * @return
	 */
	@RequestMapping("/userSearch")
	public String userSearch(@RequestParam("key") String key,ModelMap map){
		List<Food> userSearchFoodList = foodService.queryFoodByKey(key);
		map.put("userSearchFoodList", userSearchFoodList);
		return "userSearchList";
	}
}
