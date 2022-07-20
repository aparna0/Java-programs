package com.bean;

import java.io.Serializable;

public class User implements Serializable {
	
	//abstract data for user
	private String userName, password, question, answer;
	
	//constructor 
	public User(String userName, String password, String question, String answer) {
		this.setUserName(userName);
		this.setPassword(password);
		this.setQuestion(question);
		this.setAnswer(answer);
		
	}

	//setter methods
	public void setUserName(String userName) {
		this.userName = userName;
	}
	
	public void setPassword(String password) {
		this.password = password;
	}

	public void setQuestion(String question) {
		this.question = question;
	}

	public void setAnswer(String answer) {
		this.answer = answer;
	}
	
	// getter methods
	public String getUserName() {
		return userName;
	}
	
	public String getPassword() {
		return password;
	}
	
	public String getQuestion() {
		return question;
	}
	
	public String getAnswer() {
		return answer;
	}

	//tostring method
	public String toString() {
		return "User [userName=" + userName + ", password=" + password + "]";
	}

}
