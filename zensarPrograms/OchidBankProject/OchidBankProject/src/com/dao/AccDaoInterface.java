package com.dao;

import java.sql.SQLException;
import com.bean.Account;

//summary of account database operations
public interface AccDaoInterface {
	public int insertAccData(Account acc)throws SQLException;
	public Account retriveAccDetails(int accNo)throws SQLException;
	public int updateBalance(int accNo, float balance)throws SQLException;
}
