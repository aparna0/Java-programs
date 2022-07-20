package com.provider;

import java.io.FileInputStream;
import java.util.Properties;
import com.services.*;

public class UserObjectProvider {
	
	//static method to get user service object
	public static  UserServices getUserObject() {
		UserServices  user = null;
		try {
			
			FileInputStream fis = new FileInputStream(".//resources//classnames.properties");
			Properties p = new Properties();
			p.load(fis);                                              // load properties file
			String name = p.getProperty("userbusiness");              // get name of account service implementation
			user = (UserServices)Class.forName(name).newInstance();   //create instance of user service implementation
		
		}
		catch(Exception e) {
			e.printStackTrace();
		}
		return user;
	}
	
}