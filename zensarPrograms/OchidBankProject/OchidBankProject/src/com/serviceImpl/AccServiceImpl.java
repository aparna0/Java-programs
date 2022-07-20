package com.serviceImpl;

import java.sql.SQLException;

import com.Date;
import com.bean.Account;
import com.daoImpl.AccDaoImpl;
import com.exception.InsufficientFundException;
import com.exception.InvalidAccNoException;
import com.services.AccountServices;

public class AccServiceImpl implements AccountServices{
	private Account acc;
	AccDaoImpl accdao;
	
	// creating account for given data
	public int openAccount(String type, float amount, Date d) throws SQLException {
		//create account object
		acc = new Account(type,amount,d);
		accdao = new AccDaoImpl();
		//insert data
		int count = accdao.insertAccData(acc);
		return acc.getAccNO();
		
		
	}
	
  //deposit method
    public synchronized float deposit(int no, float amount) throws SQLException, InsufficientFundException, InvalidAccNoException{
        float updateBal = 0.0f;
        Account acc=null;
        accdao = new AccDaoImpl();
        //cheeck where account is opened for given account nember by retriving data of given account number
        acc = accdao.retriveAccDetails(no);
		if( acc != null ) {
			
			//if account is opened and amount is greate than 0 then update balance
	        if(amount > 0) {
	        	updateBal = acc.getAccBal() + amount;
	        	//call update balance method
	        	int i = accdao.updateBalance(no, updateBal);
	        	if(i > 0) {
	        		acc.setAccBal(updateBal);
	        		System.out.println("balance upaded...");
	        	}
	        		
	        }
	        //if amount < 0 then throw insufficient fund exception
	        else {
	        	throw new InsufficientFundException("insufficient fund");
	        }
	    }
		//if account does not opened with given number then throw invalid account number exception
	    else {
	        updateBal = 0.0f;
	        throw new InvalidAccNoException("Invalid account Number!");
	          
	    }
        return updateBal;
    }
    
    //withdraw method
    public synchronized float withdraw(int no, float amount)throws SQLException, InsufficientFundException, InvalidAccNoException{
    	float updateBal = 0.0f;
        Account acc=null;
        accdao = new AccDaoImpl();
        
        //cheeck where account is opened for given account nember by retriving data of given account number
        acc = accdao.retriveAccDetails(no);
        
      //if account is opened and amount is greate than 0 then update balance
		if( acc != null ) {
			
			//if entered amount less than balance then withdraw
	        if(amount < acc.getAccBal()) {
	        	updateBal = acc.getAccBal() - amount;
	        	int i = accdao.updateBalance(no, updateBal);
	        	
	        	if(i > 0) {
	        		acc.setAccBal(updateBal);
	        		System.out.println("balance upaded...");
	        	}
	        		
	        }
	        
	        //if entered amount greater than balance then insufficient fund exception 
	        else {
	        	throw new InsufficientFundException("insufficient fund");
	        }
	    }
		//account number is invalid or account does not exist then throw invalid account number exception
	    else {
	        updateBal = 0.0f;
	        throw new InvalidAccNoException("Invalid account Number!");
	          
	    }
		return updateBal;
    }
    
    //Balance inquiry method
    public float inquiry(int no) throws SQLException, InvalidAccNoException{
        float updateBal = 0.0f;
        Account acc=null;
        accdao = new AccDaoImpl();
        //retrive balance for given account number
        acc = accdao.retriveAccDetails(no);
		if(acc != null) {
			updateBal = acc.getAccBal();
		}
		//account number is invalid or account does not exist then throw invalid account number exception
		else {
	        updateBal = 0.0f;
	        throw new InvalidAccNoException("Invalid account Number!");
	    }
		return updateBal;
    }
    
    //display account details
    public String displayAccDetails(int accNo)throws SQLException, InvalidAccNoException{ 
     	float updateBal = 0.0f;
        Account acc=null;
        String ret = null;
        accdao = new AccDaoImpl();
        //retrive  account details
        acc = accdao.retriveAccDetails(accNo);
		if(acc != null) {
			acc = accdao.retriveAccDetails(accNo);
			ret = acc.toString();
		}
		//account number is invalid or account does not exist then throw invalid account number exception
		else {
	        updateBal = 0.0f;
	        throw new InvalidAccNoException("Invalid account Number!");
	    }
		
        return ret;
    }
  
}
