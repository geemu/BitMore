package com.bestcfm.util;
import lombok.Getter;

public class BusinessException extends RuntimeException {
	
	@Getter
	private ErrorCodeEnum errorCode;
	
	public BusinessException(String message) {
		super(message);
	}
	
	public BusinessException(ErrorCodeEnum errorCode) {
		super(errorCode.getDescription());
		this.errorCode = errorCode;
	}

	public BusinessException(Throwable cause) {
		super(cause);
	}
	
	/**
	 * 
	 */
	private static final long serialVersionUID = -3383376962482867983L;

}
