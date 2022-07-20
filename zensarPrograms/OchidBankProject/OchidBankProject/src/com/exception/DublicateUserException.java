package com.exception;

//exception for duplicate user registration
public class DublicateUserException extends Exception{
	String msg;
	public DublicateUserException(String msg) {
		this.msg = msg;
	}
	public String toString() {
		return this.msg;
	}
}
