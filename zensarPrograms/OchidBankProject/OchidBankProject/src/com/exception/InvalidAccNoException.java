package com.exception;

//Invalid account number Exception
public class InvalidAccNoException extends Exception {
	String msg;
	public InvalidAccNoException(String msg) {
		this.msg = msg;
	}
	public String toString() {
		return msg;
	}
	
	
}
