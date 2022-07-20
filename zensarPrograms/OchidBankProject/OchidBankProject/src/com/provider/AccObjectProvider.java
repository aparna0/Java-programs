package com.provider;

import java.io.FileInputStream;
import java.util.Properties;
import com.services.AccountServices;

public class AccObjectProvider {
	
	//static method to provide Account service object 
	public static  AccountServices getAccObject() {
		
		AccountServices  user = null;
		try {
			FileInputStream fis = new FileInputStream(".//resources//classnames.properties");
			Properties p = new Properties();
			p.load(fis);                                                       //load properties file
			String className = p.getProperty("accountbusiness");               //get name of account service implementation
			user = (AccountServices)Class.forName(className).newInstance();    //create instatce f account business
		}
		catch(Exception e) {
			e.printStackTrace();
		}
		return user;
	}
}
