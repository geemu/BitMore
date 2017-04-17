package com.bestcfm.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * 用于跳转的控制器
 * @author cfm
 *
 */
@Controller
@RequestMapping("/skip")
public class InitController {
	/**
	 * 公告
	 * @return
	 */
	@RequestMapping("/toNotice")  
	public String toNotice() { 
	    return "notice";  
	}
	
	/**
	 * 空的首页
	 * @return
	 */
	@RequestMapping("/toEmptyHome")
	public String toEmptyHome(){
		return "emptyHome";
	}
	

}
