package com;

public class Date {
	//data abstraction
	private int dd;  //day
	private int mm;  //month
	private int yy;  //year
	
	// constructor
	public Date(int d, int m, int y) {
		
		if(isValidDate(d, m, y)) {                                //check validity of date then create object of Date
			this.dd = d;
			this.mm = m;
			this.yy = y;
		}
	}
	
	//checking for valid date
	public static boolean isValidDate(int d, int m, int y) {
		boolean ret = false;
		if(y < 1) System.out.println("Invalid year"); 
		
		else if(m < 1 || m > 12)  System.out.println("Invalid month");
		
		else {
			if(m == 2) {                                                 //validate day with leafyear
				if(isLeafYear(y) && ( d>0 && d<=29)) ret = true; 
				else if(!isLeafYear(y) && ( d>0 && d<=28)) ret = true;   //check day with leaf year
				else {
					ret = false;
					System.out.println("Invalid day!");
				
				}
			}
			else if((m == 1||m == 3||m == 5||m == 7||m == 8||m == 10||m == 12) && ( d>0 && d<32))   ret = true;
			
			else if((m == 3||m == 6||m == 9||m == 11) && ( d>0 && d<31))   ret = true;
			
			else {
				ret = false;
				System.out.println("Invalid day!");
			}
		}
		return ret;
	}
	
	//check leaf year
	public static boolean isLeafYear(int year) {
		boolean leaf = false;
		if( (year % 100 == 0) && (year % 400 == 0))   leaf = true;
		else if(year % 4 == 0) leaf = true;
		return leaf;
	
	}
	
	// setter methods to update
	public void setDay(int d) {
		this.dd = d;
	}
	public void setMonth(int m) {
		this.mm = m;
	}
	public void setYear(int y) {
		this.yy = y;
	}
	
	// getter methods
	public int getDay() {
		return this.dd ;
	}
	public int getMonth() {
		return this.mm ;
	}
	
	public int getYear() {
		return this.yy;
	}
	
	// toString method
	public String toString() {
		return this.dd+"/"+this.mm+"/"+this.yy;
	}
	
}

