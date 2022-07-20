package com.database;
import java.sql.DriverManager;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
public class PreparedStatementDemo {

	public static void main(String[] args) {
		Connection con;
		PreparedStatement pst;
		ResultSet rs;
		int count;
		try {
			Class.forName("com.mysql.jdbc.Driver");
			System.out.println("Driver loaded...");
			con = DriverManager.getConnection("jdbc:mysql://localhost:3306/db_project?useSSL=false","root","Aparna@123");
			System.out.println("connection done...");
			System.out.println("display data from dept where department name is cse and id is 1");
			pst = con.prepareStatement("select * from dept where id = ? and department = ?;");
			pst.setInt(1,1);
			pst.setString(2,"cse");
			rs = pst.executeQuery();
			
			System.out.println("name\tId");
			while(rs.next()) {
				System.out.println(rs.getString(1)+"\t"+rs.getInt(2));
			}
			pst = con.prepareStatement("update dept set department = ? where id = ?");
			pst.setString(1, "mech");
			pst.setInt(2, 4);
			count = pst.executeUpdate();
			if(count > 0 )   System.out.println("update successful.");
			else   System.out.println("update faild!");
		}catch(ClassNotFoundException e) {
			e.printStackTrace();
		}catch(SQLException e) {
			e.printStackTrace();
		}
	}

}
