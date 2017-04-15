package com.bestcfm.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.SessionAttributes;

import com.bestcfm.bean.Emp;
import com.bestcfm.bean.FoodOrderDetail;
import com.bestcfm.service.EmpService;
import com.bestcfm.service.FoodOrderDetailService;
import com.bestcfm.util.TimeUtil;

@Controller
@RequestMapping("/emp")
@SessionAttributes("loginEmp")
public class EmpController {
	
	@Autowired
	private EmpService empService;
	@Autowired
	private FoodOrderDetailService foodOrderDetailService;
	/**
	 * 员工登录
	 * @param phone
	 * @param empPassword
	 * @param map
	 * @return
	 */
	@RequestMapping("/doEmpLogin")
	public String doEmpLogin(@RequestParam("phone")String phone,@RequestParam("empPassword")String empPassword,ModelMap map) {
		Emp loginEmp = empService.queryEmpByPhoneAndPassword(phone, empPassword);
		if(loginEmp == null){
			return "empLogin";
		}
		else {
			map.put("loginEmp", loginEmp);
			int empRoot = loginEmp.getEmpRoot();
			if(empRoot == 0){
				List<FoodOrderDetail> cookCenterFoodList = foodOrderDetailService.cookCenter();
				for(int i = 0 ;i<cookCenterFoodList.size();i++){
					cookCenterFoodList.get(i).setCreateTime(TimeUtil.convertParamDateTypeToDateOnlyDay(cookCenterFoodList.get(i).getCreateTime()));
				}
				map.put("cookCenterFoodList", cookCenterFoodList);
				return "cookCenter";
			}
			else if(empRoot == 1){
				return "waiterCenter";
			}
			else if(empRoot == 2){
				return "adminCenter";
			}
			else{
				return "empLogin";
			}
		}	
	} 

}
