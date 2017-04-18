package com.bestcfm.bean.custom;

import lombok.Data;

/**
 * Author:陈方明
 * Email:cfmmail@sina.com
 * Created on 2017 	下午7:35:18
 */
@Data
public class AddNewFoodPoJo {
  
	private int foodTypeId;
	private String foodName;
	private int price;
	private int recommend;
	private int signiture;
}
