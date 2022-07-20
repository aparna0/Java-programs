package com.services;

import java.sql.SQLException;

import com.bean.User;
import com.exception.DublicateUserException;

//summary of user related services
public interface UserServices {
	public boolean signUp(String name, String password, String question, String answer) throws DublicateUserException, SQLException;
	public User signIn(String name, String password) throws SQLException;
	public String forgotPassword(String name, String question, String answer) throws SQLException;
	public boolean updatePassword(String name, String password, String confirmPassword) throws SQLException;
}
