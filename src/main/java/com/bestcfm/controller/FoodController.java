package com.bestcfm.controller;

import java.io.File;
import java.util.Date;
import java.util.Iterator;
import java.util.List;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.multipart.MultipartFile;
import org.springframework.web.multipart.MultipartHttpServletRequest;
import org.springframework.web.multipart.commons.CommonsMultipartResolver;

import com.bestcfm.bean.Food;
import com.bestcfm.bean.FoodType;
import com.bestcfm.bean.custom.AddNewFoodPoJo;
import com.bestcfm.service.FoodService;
import com.bestcfm.service.FoodTypeService;
import com.bestcfm.util.OrderUtil;

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
	@Autowired
	private FoodTypeService foodTypeService;
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
		map.put("key", key);
		return "userSearchList";
	}
	/**
	 * 菜品管理
	 * @param map
	 * @return
	 */
	@RequestMapping("/manageFood")
	public String manageFood(ModelMap map){
		List<Food> allFoodList = foodService.queryAllFood();
		map.put("allFoodList", allFoodList);
		return "manageFood";
	}
	@RequestMapping("/addNewFood")
	@ResponseBody
	public String addNewFood(HttpServletRequest request,@ModelAttribute AddNewFoodPoJo addNewFoodPoJO){
		CommonsMultipartResolver multipartResolver=new CommonsMultipartResolver(request.getSession().getServletContext());
		if(multipartResolver.isMultipart(request)){
			 MultipartHttpServletRequest multiRequest=(MultipartHttpServletRequest)request;
			 Iterator iter = multiRequest.getFileNames();
			 while(iter.hasNext()){
				 MultipartFile file=multiRequest.getFile(iter.next().toString());
				 if(file!=null){
					 String foodImage = OrderUtil.getOrderNumber()+".jpg";
					 String path = request.getServletContext().getRealPath("/")+"foodImages\\"+foodImage;
					 System.out.println(path);
					 //查询当前菜品的类别名称
					 FoodType type = foodTypeService.queryFoodTypeById(addNewFoodPoJO.getFoodTypeId());
					 Food food = new Food();
					 food.setFoodName(addNewFoodPoJO.getFoodName());
					 food.setPrice(addNewFoodPoJO.getPrice());
					 food.setTypeId(addNewFoodPoJO.getFoodTypeId());
					 food.setTypeName(type.getTypeName());
					 food.setSigniture(addNewFoodPoJO.getSigniture());
					 food.setRecommend(addNewFoodPoJO.getRecommend());
					 food.setFoodImage("/BitMore/foodImages/"+foodImage);
					 food.setCreateTime(new Date());
					 foodService.addNewFood(food);
					 try {
						file.transferTo(new File(path));
					} catch (Exception e) {
						e.printStackTrace();
						return "上传失败";
					} 
				 }
			 }
		}
		return "上传成功"; 
	 }
	/**
	 * 删除菜品
	 * @param foodId
	 * @return
	 */
	@RequestMapping("deleteFood")
	@ResponseBody
	public String doDeleteFood(@RequestParam("foodId") int foodId){
		Food food = new Food();
		food.setId(foodId);
		food.setDataFlag(1);
		return foodService.updateFood(food) == true?"删除成功":"删除失败";
	}
	
	/**
	 * 用户类别搜索
	 * @param key
	 * @param map
	 * @return
	 */
	@RequestMapping("/leibiesousuo")
	public String leibiesousu(@RequestParam("id") int id,ModelMap map){
		List<Food> userSearchFoodList = foodService.leibiesousu(id);
		map.put("userSearchFoodList", userSearchFoodList);
		return "userSearchList";
	}
	/**
	 * 食客最爱
	 * @param map
	 * @return
	 */
	@RequestMapping("/shikezuiai")
	public String shikezuiai(ModelMap map){
		List<Food> userSearchFoodList = foodService.queryFavouriteFoodList();//食客最爱
		map.put("userSearchFoodList", userSearchFoodList);
		return "userSearchList";
	}
	
}
