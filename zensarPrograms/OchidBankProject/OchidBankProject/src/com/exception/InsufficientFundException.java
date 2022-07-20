package com.exception;

//Insufficient Fund Exception
public class InsufficientFundException extends Exception {
	String msg;

	public InsufficientFundException(String msg) {
		this.msg = msg;
	}

	public String toString() {
		return msg;
	}
	
	
}
