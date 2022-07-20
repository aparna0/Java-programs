package com.constraint;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class UserConstraint {
	
	//user name validation
	public static boolean isValidUserName(String name) {
		boolean ret = true;
		if( name.isBlank()) {
			ret = false;
			System.out.println("Invalid username!");
		}
		return ret;
	}
	
	//checking password constraint
	public static boolean isValidPassword(String password) {
		boolean ret = true;
		if(password.isBlank()) {
			ret = false;
			System.out.println("Invalid username!");
		}
		else {
			String regex = "^(?=.*[0-9])(?=.*[a-z])(?=.*[A-Z])(?=.*[!@#$%^&*-+])(?=\\S+$).{8,20}$";
			Pattern p = Pattern.compile(regex);
			Matcher m = p.matcher(password);
			ret = m.matches();
			if(ret == false)   System.out.println("Invalid password!");
		}
		return ret;
	}
	
}
