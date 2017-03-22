package com.bestcfm.bean.custom;

import lombok.Data;

@Data
public class ResponseBase<T> {
	
	private boolean isSuccess;

	private String error;

	private Integer errorCode;

	private T content;
	
	public ResponseBase() {
		setIsSuccess(true);
		error = "";
	}
	
	public ResponseBase(boolean isSuccess,String errMsg,T content) {
		this.isSuccess=isSuccess;
		this.error=errMsg;
		this.content=content;
	}

	public boolean getIsSuccess() {
		return isSuccess;
	}

	public void setIsSuccess(boolean isSuccess) {
		this.isSuccess = isSuccess;
	}
	
	
}
