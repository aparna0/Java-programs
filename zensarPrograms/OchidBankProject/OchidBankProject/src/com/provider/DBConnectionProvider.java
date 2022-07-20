package com.provider;

import java.io.FileInputStream;
import java.sql.Connection;
import java.sql.DriverManager;
import java.util.Properties;

public class DBConnectionProvider {
	FileInputStream fis;
	Properties p;
	Connection con;
	
	//method to get connection object
	public Connection getConnection() {
		Connection con = null;
		
		try {
			fis = new FileInputStream(".//resources//DBConfig.properties");
			
                        //loading property to get specified driver class to make specified database connection
			p = new Properties();
			p.load(fis);        
			
                        //get specified driver class 
			Class.forName(p.getProperty("driverclass"));        
			
                        //to make specified database connection
			con = DriverManager.getConnection(p.getProperty("url"),p.getProperty("username"),p.getProperty("password"));
			
		} 
		catch (Exception e) {
			e.printStackTrace();
		}
		return con;
	}
}
