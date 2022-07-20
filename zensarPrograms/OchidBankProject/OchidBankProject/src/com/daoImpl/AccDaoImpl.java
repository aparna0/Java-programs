package com.daoImpl;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import com.Date;
import com.bean.Account;
import com.dao.*;
import com.provider.DBConnectionProvider;
public class AccDaoImpl implements AccDaoInterface{

	Connection con;
	//refrence of database connection object provider
	DBConnectionProvider dbobj;
	Statement st;
	PreparedStatement pst;
	ResultSet rs;
	
	public AccDaoImpl() {
		//get connection object from database connection provider
		dbobj = new DBConnectionProvider();
		con = dbobj.getConnection();
	}
	
	//insert new account data into user table
	public int insertAccData(Account acc) throws SQLException {
		int ret = 0;
		dbobj = new DBConnectionProvider();
		con = dbobj.getConnection();
		pst = con.prepareStatement("insert into account values(?,?,?)");
		pst.setInt(1, acc.getAccNO());
		pst.setString(2, acc.getAccType());
		pst.setFloat(3, acc.getAccBal());
		//execute query
		ret = pst.executeUpdate();
		//return updated count to predict insertion is done
		return ret;
	}

	//retrive account details
	public Account retriveAccDetails(int accNo) throws SQLException {
		Account acc = null;
		//select query
		pst = con.prepareStatement("select * from account where accno=?");
		pst.setInt(1, accNo);
		rs = pst.executeQuery();
		//account exit with given account number then create new account object
		if(rs.next()) {
			acc = new Account(rs.getString(2),rs.getFloat(3),(new Date(28,11,2020)));
			acc.setAccNo(rs.getInt(1));
		}
		//if account does not exit with given account number then make accunt object null
		else acc = null;
		//return account objcet
		return acc;
	}

	//update balance for given account
	public int updateBalance(int accNo, float balance) throws SQLException {
		int ret = 0;
		//update query
		pst = con.prepareStatement("update account set balance = ? where accno = ?;");
		pst.setFloat(1, balance);
		pst.setInt(2, accNo);
		ret = pst.executeUpdate();
		//if balance updated for given account number then return updated count
		return ret;
	}
	
}


