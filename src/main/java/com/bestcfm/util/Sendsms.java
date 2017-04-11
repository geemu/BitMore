package com.bestcfm.util;

import org.apache.commons.httpclient.HttpClient;
import org.apache.commons.httpclient.NameValuePair;
import org.apache.commons.httpclient.methods.PostMethod;
 

/**
 * 获取手机验证码
 * Author:陈方明
 * Email:cfmmail@sina.com
 * Created on 2017 	下午4:51:58
 */
public class Sendsms {
	
	private static String URL = "http://106.ihuyi.cn/webservice/sms.php?method=Submit";
	
	public static int getPhoneValidateCode(String phone) {		
		HttpClient client = new HttpClient(); 
		PostMethod method = new PostMethod(URL);
		client.getParams().setContentCharset("UTF-8");
		method.setRequestHeader("ContentType","application/x-www-form-urlencoded;charset=UTF-8");
		int mobile_code = (int)((Math.random()*9+1)*100000);
	    String content = new String("您的验证码是：" + mobile_code + "。请不要把验证码泄露给其他人。");
		NameValuePair[] data = {
			    new NameValuePair("account", "C83144773"),
			    new NameValuePair("password", "c6e77b34d620bbf742bbd01eec673cfe"),
			    new NameValuePair("mobile", phone), 
			    new NameValuePair("content", content),
		};
		method.setRequestBody(data);
		try {
			client.executeMethod(method);		
		} catch (Exception e) {
			e.printStackTrace();
		} 
		return mobile_code;	
	}
	
	public static void main(String[] args) {
		getPhoneValidateCode("18852950875");
	}
	
}