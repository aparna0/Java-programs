package com.bean;
import com.Date;


public class Account {
	
    // data abstraction of account
    private int accNo;                                   //account number
    private String accType;                              //account type
    private float accBal;                                //account balance
    private Date accOpeningDate;                         //account opening date
    protected static String ifscCode;                    //IFSC code
    protected static int accNoSeries;                    //for account number generation
   
    //static block to initialize ifsccode and account number series
    static {
    	ifscCode ="ABCS28974F";
    	accNoSeries = 100;
    }
  
    // constructor
    public Account( String type, float bal, Date d){
        this.accNo = accNoSeries;
        accNoSeries ++;
        this.accType = type;
        this.accBal = bal;
        this.accOpeningDate = d;
    }
    
    // setter methods
    public void setAccNo(int no) {
    	this.accNo = no;
    }
    public void setAccType(String type){
        this.accType = type;
    }
    public void setAccBal(float bal){
        this.accBal = bal;
    }
    public void setAccOpeningDate(Date d) {
    	this.accOpeningDate = d;
    }
    
    // getter methods
    public int getAccNO(){
        return this.accNo;
    }
    public String getAccType(){
        return this.accType;
    }
    public float getAccBal(){
        return this.accBal;
    }
    public Date getAccOpeningDate() {
    	return this.accOpeningDate;
    }
    public String getIfscCode() {
    	return ifscCode;
    }
    
    // toString method
    public String toString(){
        return accNo+"/"+accType+"/"+accBal+"/"+accOpeningDate;
    }
}
