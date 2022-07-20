package com.services;

import java.sql.SQLException;
import com.Date;
import com.exception.InsufficientFundException;
import com.exception.InvalidAccNoException;

//summary of account related services
public interface AccountServices {
	public int openAccount(String type, float amount, Date d) throws SQLException;
	public float deposit(int no, float amount) throws SQLException, InsufficientFundException, InvalidAccNoException; 
	public float withdraw(int no, float amount) throws SQLException, InsufficientFundException, InvalidAccNoException ;
	public float inquiry(int no) throws SQLException, InvalidAccNoException ;
	public String displayAccDetails(int accNo) throws SQLException, InvalidAccNoException; 
}
