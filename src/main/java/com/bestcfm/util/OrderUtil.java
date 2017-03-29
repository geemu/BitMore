package com.bestcfm.util;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Random;

public class OrderUtil {
	
    private static final String dtLong = "yyMMddHHmmssSSS";

    /**
     * 三位随机数
     * @return
     */
    public static String getThree(){
		Random rad=new Random();
		return rad.nextInt(1000)+"";
	}
    /**
     * 生成订单号	时间加随机三位数
     * @return
     */
	public  static String getOrderNumber(){
		Date date=new Date();
		SimpleDateFormat sdf=new SimpleDateFormat(dtLong);
		return sdf.format(date)+getThree();
	}
	
	public static void main(String[] args) {
		System.out.println(getOrderNumber());
		
	}
	
}
