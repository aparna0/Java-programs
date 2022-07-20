package com.client;

import com.Date;
import com.bean.User;
import com.exception.DublicateUserException;
import com.exception.InsufficientFundException;
import com.exception.InvalidAccNoException;
import com.provider.AccObjectProvider;
import com.provider.UserObjectProvider;
import com.services.*;
import java.sql.SQLException;
import java.util.*;

public class UserCode {
	public static void main(String args[]) {
		
		//create reference of user service which holds object of user business
		UserServices userser = UserObjectProvider.getUserObject();
		Scanner sc = new Scanner(System.in);
		User user = null;
		
		System.out.println("************************************Orchid Bacnk System*********************************");
		int choice;
		do {
				String name, password = null, question, answer;
				
				// list of different user operations in switch driven
				System.out.println("\n1.SignUp\n2.SignIn\n3.Forgot password\n4.exit\n Enter your choice");
				
				// take choice from user
				choice = sc.nextInt();
				
				//proceed sign up process
				if(choice == 1) {
					System.out.println("---------------------------------SignUp-------------------------------");
					//take user name
					System.out.println("Enter username  ");
					name = sc.next();       
					//take password
					System.out.println("Enter password  ");
					password = sc.next();             
					//take security question
					System.out.println("Enter question  ");
					question = sc.next();         
					//take security answer
					System.out.println("Enter answer  ");
					answer = sc.next();                                           
					try {
						//call to signup method
						if(userser.signUp(name, password, question, answer)) {          
							System.out.println("Registration done successfully...");    
						}
						else {
							System.out.println("Signup failed!");   
						}
					} 
					// throws duplicate user exception if user all ready registered
					catch (DublicateUserException e) {  
						System.out.println(e);
					} 
					catch (SQLException e) {
						System.out.println(e);
					}
				}
				
				//proceed signin process
				else if(choice == 2) {
					System.out.println("---------------------------------SignIp-------------------------------");
					//take user name
					System.out.println("Enter username  ");
					name = sc.next();                   
					//take password
					System.out.println("Enter password  ");
					password = sc.next();                                        
					try {
						//call to sign in method
						user = userser.signIn(name, password);                   
					} 
					catch (SQLException e) {
						e.printStackTrace();
					}
					//if sign is done and returns user object
					if(user != null) {                                           
						System.out.println("Login successfully...");
						// after signin call accountcode() method to perform further account related operations
						(new UserCode()).accountCode(user, userser);
					}
					else {
						System.out.println("Invalid username and password");
					}
				}
				
				//proceed forgot password process
				else if(choice == 3) {
					System.out.println("---------------------------------Faurgot Password-------------------------------");
					 //take user name
					System.out.println("Enter username  ");
					name = sc.next();  
					//take security question
					System.out.println("Enter question  ");
					question = sc.next();    
					//take security answer
					System.out.println("Enter answer  ");
					answer = sc.next();                                         
					try {
						//call to forgotPassword method and returns passwrd 
						password = userser.forgotPassword(name, question, answer);
					} 
					catch (SQLException e) {
						System.out.println(e);
					}
					// if it retuens null passwrd
					if(password == null) {
						System.out.println("Invalid data!\nPlease enter correct information");
					}
					// else printing passwrd
					else {
						System.out.println("Your password = "+password);
					}
				}
				
				//if user entered 4 to exit then close it with 0 returns
				else if(choice == 4) {
					System.exit(0);
				}
				
				//if user entered incurrect choice then display error massage
				else {
					System.out.println("Invalid input!\nPlease enter correct choice");
				}
				
			}while(true); //while use does not want to end
		
	}
	
	//when user signin then allow user to perform change password, open account, inquiry and different transactions
	public void accountCode(User user, UserServices userser) {
		int choice = 0;
		Scanner sc = new Scanner(System.in);
		
		do {
			System.out.println("***********************************************************************");
			//display list of operations
			System.out.println("\n1.Change password\n2.Open Account\n3.Deposit\n4.Withdraw\n5.inquiry(check balance)\n6.Display account details\n7.Back");
			//ask user to enter choice
			System.out.println(" Enter your choice ");
			//take user choice
			choice = sc.nextInt();
			//create reference of account service which holds object of account business
			AccountServices accser = AccObjectProvider.getAccObject();
			
			//proceed chage password process
			if(choice == 1) {
				System.out.println("---------------------------------Change Password-------------------------------");
				//take user name
				System.out.println("Enter username  ");
				String name = sc.next();    
				//take new password 
				System.out.println("Enter password  ");
				String password = sc.next();          
				 //take user confirm password
				System.out.println("Enter confirm password  ");
				String cnfpassword = sc.next();                              
				try {
					//upadte password
					if(userser.updatePassword(name, password, cnfpassword)) {
						user.setPassword(password);
						System.out.println("Password updated successully...");
					}
				}
				catch (SQLException e) {
					System.out.println(e);
				}
			}
			
			//proceed open account process
			else if(choice == 2) {
				System.out.println("---------------------------------Open Account-------------------------------");
				//take account type
				System.out.println("Enter account type  ");
				String type = sc.next();                                     
				//take account initial balance
				System.out.println("Enter account balance  ");
				float balance = sc.nextFloat();                             
				try {
					System.out.println("Account opened with account number : "+ accser.openAccount(type, balance, (new Date(29,11,2020))));
				} 
				catch (SQLException e) {
					
					System.out.println(e);
				}
			}

			//proceed deposit process
			else if(choice == 3) {
				System.out.println("---------------------------------Deposit-------------------------------");
				//take account number
				System.out.println("Enter account number  ");
				int no = sc.nextInt();                                       
				//take amount to deposit
				System.out.println("Enter amount  ");
				float amount = sc.nextFloat();                               
				try {
					System.out.println("Updated balance : "+ accser.deposit(no, amount));
				} 
				catch (SQLException e) {
					System.out.println(e);
				} 
				//Insufficient fund exception
				catch (InsufficientFundException e) {                         
					System.out.println(e);
				} 
				 //Invalid account number exception
				catch (InvalidAccNoException e) {                            
					System.out.println(e);
				}
			}

			//proceed withdraw process
			else if(choice == 4) {
				System.out.println("---------------------------------Withdraw-------------------------------");
				//take account number
				System.out.println("Enter account number  ");
				int no = sc.nextInt();
				//take amount to dithdraw
				System.out.println("Enter amount  ");
				float amount = sc.nextFloat();
				try {
					System.out.println("Updated balance : "+ accser.withdraw(no, amount));
				} 
				catch (SQLException e) {
					System.out.println(e);
				} 
				//Insufficient fund exception
				catch (InsufficientFundException e) {                                            
					System.out.println(e);
				} 
				//Invalid account number exception
				catch (InvalidAccNoException e) {                            
					System.out.println(e);
				}
			}
			
			//proceed inquiry(check balance) process
			else if(choice == 5) {
				System.out.println("---------------------------------Inquiry-------------------------------");
				//take account number
				System.out.println("Enter account number  ");
				int no = sc.nextInt();
				try {
					System.out.println("Account balance : "+accser.inquiry(no));
				} 
				catch (SQLException e) {
					System.out.println(e);
				}
				//Invalid account number exception
				catch (InvalidAccNoException e) {
					System.out.println(e);
				}
			}
			
			//display account details
			else if(choice == 6) {
				System.out.println("---------------------------------Account Details-------------------------------");
				System.out.println("Enter account number  ");
				int no = sc.nextInt();
				String str = null;
				try {
					str = accser.displayAccDetails(no);
					if(str != null)   {
						System.out.println(str);
					}
				}
				catch (SQLException e) {
					System.out.println(e);
				} 
				//Invalid account number exception
				catch (InvalidAccNoException e) {
					System.out.println(e);
				}
				
				
			}
			
			//log out (back)
			if(choice == 7)   System.out.println("************************************************************************");
			
			//if user entered incurrect choice then display error massage
			else {
				System.out.println("Enter correct choice");
			}
			
		}while(choice != 7);  //while account user does not log out
	}
}


