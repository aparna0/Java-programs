package com.dao;

import java.sql.SQLException;
import com.bean.User;

//summary of user database operations
public interface UserDaoInterface {
	public int insertUserData(User user)throws SQLException;
	public User isValidLogin(String name, String pass)throws SQLException;
	public String getPassword(String name, String que, String ans)throws SQLException;
	public boolean updatePassword(String name, String pass)throws SQLException;
}
