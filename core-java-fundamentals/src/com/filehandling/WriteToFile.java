package com.filehandling;

import java.io.FileWriter;
import java.io.IOException;

public class WriteToFile {

	public static void main(String[] args) throws IOException {
		
		FileWriter fw = new FileWriter("F:\\java_programs\\core-java-fundamentals\\src\\com\\filehandling\\ioFile.txt");
		fw.write("Banglore-BJP=11014,INC=17803,CPI=4923,NCP=2069\r\n"
				+ "Pune-BJP=9389,INC=4829,NCP=3375,BSP=3371,IND=309");
		fw.close();
		System.out.println("Content is successfully wrote to the file."); 
	}

}
