package com.bestcfm.bean.custom;


import java.util.LinkedList;
import java.util.List;

import lombok.Data;

/**
 * 新的对象  我要处理成的最终对象
 * @author cfm44850
 *
 */
@Data
public class EchartsConfig {
	 private List<String> xAxisData;//x轴的数据
	 private List<Integer> yAxisData;//y轴的数据
	 private String titleText;//每个数据的标题
	 
	public  EchartsConfig(){
		xAxisData = new LinkedList<>();
		yAxisData = new LinkedList<>();
		titleText = null;
	}
}
