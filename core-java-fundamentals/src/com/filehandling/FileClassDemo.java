package com.filehandling;

import java.io.File;
import java.io.IOException;

public class FileClassDemo {

	public static void main(String[] args) {
		try {
			File fileObject = new File("F:\\java_programs\\core-java-fundamentals\\src\\com\\filehandling\\ioFile.txt");
			
			if(fileObject.exists()) {
				System.out.println("File Exists");
			}
			else {
				System.out.println("File not Exists");
				
				if(fileObject.createNewFile()) 
					System.out.println("File created successfuly");
			}
			
			System.out.println("File Name : " + fileObject.getName());
			System.out.println("File absolute path : " + fileObject.getAbsolutePath());
			
			if(fileObject.canRead()) {
				System.out.println("File is readable");
			}
			else {
				System.out.println("File is not readable");
			}
			
			if(fileObject.canWrite()) {
				System.out.println("File is writable");
			}
			else {
				System.out.println("File is not writable");
			}
			
			if(fileObject.canExecute()) {
				System.out.println("File is executable");
			}
			else {
				System.out.println("File is not executable");
			}
			
			System.out.println("Length of file is "+ fileObject.length());
			
		}catch(IOException e) {
			
		}
	}

}

	