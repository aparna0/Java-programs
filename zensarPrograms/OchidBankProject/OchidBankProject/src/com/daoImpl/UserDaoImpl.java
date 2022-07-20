package com.daoImpl;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import com.bean.Account;
import com.bean.User;
import com.dao.UserDaoInterface;
import com.provider.DBConnectionProvider;

public class UserDaoImpl implements UserDaoInterface {
	Connection con;                    
	PreparedStatement pst;
	Statement st;
	ResultSet rs;
	//refrence of database connection object provider
	DBConnectionProvider dbcon;    
	
	public UserDaoImpl() {
		//get connection object from database connection provider
		dbcon = new DBConnectionProvider();
		con = dbcon.getConnection();
	}
	
	//insert new user data into user table
	public int insertUserData(User user)throws SQLException{
		
		//insert query and setting user entered values
		pst = con.prepareStatement("INSERT INTO User VALUES(?,?,?,?)");
		pst.setString(1,user.getUserName());
		pst.setString(2, user.getPassword());
		pst.setString(3, user.getQuestion());
		pst.setString(4, user.getAnswer());
		//execute query
		int count = pst.executeUpdate();
		con.close();
		//return updated count to predict insertion is done
		return count;
	}
	
	//faugot password (get password of user from database)
	public String getPassword(String name, String que, String ans) throws SQLException {
		String prd = null;
		//select query to get password if user exits
		pst = con.prepareStatement("select password from user where username = ? and question = ? and answer = ?");
		pst.setString(1, name);
		pst.setString(2, que);
		pst.setString(3, ans);
		//execute query
		rs = pst.executeQuery();
		while(rs.next())
			prd = rs.getString(1);
		con.close();
		//return password
		return prd;
	}
	
	//change password
	public boolean updatePassword(String name, String password) throws SQLException {
		boolean ret;
		//check where user is presemt with given username
		pst = con.prepareStatement("select username from user");
		rs = pst.executeQuery();
		int count = 0;
		while(rs.next()) {
			//if user is present then call update query
			if(rs.getString(1).equals(name)) {
				pst = con.prepareStatement("update user set password = ? where username = ?");
				pst.setString(1, password);
				pst.setString(2, name);
				count = pst.executeUpdate();
			}
		}
		//if user is present and password has updated
		if(count > 0) 
			ret= true;
		//if user not found and password has not updated
		else {
			System.out.println("Invalid username!");
			ret = false;
		}
		con.close();
		return ret;
	}

	//check where user is valid or not
	public User isValidLogin(String name, String pass) throws SQLException {
		User user = null;
		//check where user is present with given username and passwor
		pst = con.prepareStatement("select * from user where username = ?");
		pst.setString(1, name);
		rs = pst.executeQuery();
		
		while(rs.next()) {
			//if user present in table then valid user 
			if( (rs.getString(1)).equals(name) && (rs.getString(2)).equals(pass)) {
				user = new User(rs.getString(1),rs.getString(2),rs.getString(3),rs.getString(4));
			}
			
		}
		//return user
		con.close(); 
		return user;
	}
	
	
}
