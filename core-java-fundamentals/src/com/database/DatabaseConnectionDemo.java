package com.database;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class DatabaseConnectionDemo {

	public static void main(String[] args) {
		Connection con;
		Statement st;
		ResultSet rs;
		try {
			System.out.println("Loading driver class...");
			String driverClass = "com.mysql.jdbc.Driver";//com.mysql.jdbc.Driver
			Class.forName(driverClass);          //throws ClassNotFoundException
			System.out.println("driver class loaded.");
			System.out.println("Creating connection...");
			String url = "jdbc:mysql://localhost:3306/db_project?useSSL=false";
			String userName = "root";
			String password = "Aparna@123";
			con = DriverManager.getConnection(url,userName,password); //throws SQLException
			System.out.println("connection done.");
			
			//get tables list();
			st = con.createStatement();
			rs = st.executeQuery("show tables;");
			System.out.println("List of table in db_Project databses :");
			while(rs.next()) {
				System.out.println("   "+rs.getString(1));
			}
		} 
		catch (ClassNotFoundException e) {
			e.printStackTrace();
		} 
		catch (SQLException e) {
			e.printStackTrace();
		}
	}

}
