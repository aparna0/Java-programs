package com.serviceImpl;
import com.annotation.*;
import com.constraint.UserConstraint;
import com.daoImpl.UserDaoImpl;
import com.exception.DublicateUserException;
import com.bean.*;
import com.services.UserServices;

import java.sql.*;
public class UserServiceImpl implements UserServices{
	
	UserDaoImpl impl;
	User user;
	
	//sign up method
	public boolean signUp(String name, String password, String question, String answer) throws DublicateUserException, SQLException {
		boolean ret = false;
		
		//check username validity, password constraints, check where they are blanck or not
		if(UserConstraint.isValidUserName(name) && UserConstraint.isValidPassword(password) && (!question.isBlank()) && (!answer.isBlank())) {
			
			User user = null;
			impl = new UserDaoImpl();
			//check user is all ready registered or not
			user = impl.isValidLogin(name,password);
			//if user is all ready registered then throw DublicateUserException
			if(user != null) {
				ret = false;
				throw (new DublicateUserException("You are allready registered!"));
				
			}
			//if user not yet registered then create user
			else {
				 user = new User(name,password,question,answer);
				 int i= 0;
				 //insert query
				 i = impl.insertUserData(user);
				 if(i > 0)  ret = true;
				 else ret = false;
			}
			
		}
		else {
			//not valid username of password
			ret = false;
		}
		return ret;
	}
	
	//sign in method
	@UserAnnotation(name = "signIn business logic", no = 10) 
	public User signIn(String name, String password)throws SQLException {
		User user = null;
		impl = new UserDaoImpl();
		//check user is valid or not
		user = impl.isValidLogin(name,password);
		//if valid user then return user object
		return user;
	}
	
	//forgot password method
	public String forgotPassword(String name, String question, String answer) throws SQLException {
		String ret = null;
		impl = new UserDaoImpl();
		
		//get password for given username, security questiona and answer
		ret = impl.getPassword(name, question, answer);
		
		//if user exist then return password else null
		return ret;
	}

	//update password method
	public boolean updatePassword(String name, String password, String confirmPassword) throws SQLException {
		boolean ret = false;
		
		//check where entered password and confirm password same or not
		if(password.equals(confirmPassword)) {
			
			//check password constraints
			if(UserConstraint.isValidPassword(password)) {
				
				//password is valid then update password
				impl = new UserDaoImpl();
				ret = impl.updatePassword(name, password);
			}
		}
		else {
			//if entered password and confirm password are not
			System.out.println("password and confirm password are not matching!");
		}
		//return update count
		return ret;
	}
}
