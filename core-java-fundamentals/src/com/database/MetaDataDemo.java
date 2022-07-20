package com.database;
import java.sql.SQLException;
import java.sql.Connection;
import java.sql.DatabaseMetaData;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.sql.Statement;
import java.util.Scanner;
public class MetaDataDemo {

	public static void main(String[] args) {
		try{
			System.out.println("loading driver class...");
			Class.forName("com.mysql.jdbc.Driver");
			System.out.println("Driver loaded.");
			Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/db_project?useSSL=false","root","Aparna@123");
			System.out.println("connection done");
			
			//DatabaseMetada...
			DatabaseMetaData dbmd = con.getMetaData();
			//Database product name
			System.out.println("Database product name : "+dbmd.getDatabaseProductName());
			//Database product version
			System.out.println("Database product version : "+dbmd.getDatabaseProductVersion());
			//Driver name
			System.out.println("Driver name : "+ dbmd.getDriverName());
			//Driver version
			System.out.println("Driver version : "+ dbmd.getDriverVersion());
			//get User name
			System.out.println("User name : "+dbmd.getUserName());
			//list of catalog
			System.out.println("list of catalogs in database");
			ResultSet rs = dbmd.getCatalogs();
			while(rs.next()) {
				System.out.println(rs.getObject(1));
			}
			//get description of tables 
			rs = dbmd.getTables("db_project", null, null, null);
			System.out.println("catalog\tschema\ttable name\ttable schema");
			while(rs.next()) {
			
				System.out.println(rs.getObject(1)+"\t"+rs.getObject(2)+"\t"+rs.getObject(3)+"\t\t"+rs.getObject(4));
			}
			System.out.println("Enter database name to display lsi of tables present in that databse");
			Scanner sc = new Scanner(System.in);
			String dbName = sc.next();
			System.out.println("List of tables in "+dbName);
			rs = dbmd.getTables(dbName, null, null, null);
			while(rs.next()) {
				System.out.println(rs.getObject(3));
			}
			
			while(rs.next()) {
				System.out.println(rs.getObject(1));
			}
			//Retrieves the String that this database uses as the separator between a catalog and table name
			System.out.println("catolog seperator is ' "+dbmd.getCatalogSeparator()+" '");
			
		
			//ResultSetMetaData....
			Statement st = con.createStatement();
			System.out.println("Extracting data from stud1 table :");
			 rs = st.executeQuery("select * from stud1;");
			ResultSetMetaData rsmd = rs.getMetaData();
			//get column count of table
			int colCount = rsmd.getColumnCount();
			//Printing column names
			for(int i=1; i<= colCount; i++) {
				System.out.print(rsmd.getColumnName(i)+"\t");
			}
			//get rows from table
			while(rs.next()) {
				System.out.println();
				//getting every column from row
				for(int i=1; i<= colCount; i++) {
					System.out.print(rs.getObject(i)+"\t");
				}
				
			}
		}
		catch(ClassNotFoundException e) {
			e.printStackTrace();
		}
		catch(SQLException e) {
			e.printStackTrace();
		}
	}

}
