package com.epsilon;

public class ThisIsMyException extends Exception {

	String message;
	String errCode;

	public ThisIsMyException(String message, String errCode) {
		super();
		this.message = message;
		this.errCode = errCode;
	}

	@Override
	public String toString() {
		return "ThisIsMyException [message=" + message + ", errCode=" + errCode + "]";
	}

	public String getMessage() {
		return message;
	}

	public void setMessage(String message) {
		this.message = message;
	}

	public String getErrCode() {
		return errCode;
	}

	public void setErrCode(String errCode) {
		this.errCode = errCode;
	}
	

}
