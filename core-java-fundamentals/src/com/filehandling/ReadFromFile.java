package com.filehandling;
import java.nio.file.*;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Scanner;

public class ReadFromFile {

	public static void main(String[] args) throws IOException {
		System.out.print( Files.walk( Paths.get("\\src\\com")). count());
    /*
		File fObj = new File("F:\\java_programs\\core-java-fundamentals\\src\\com\\filehandling\\ioFile.txt");
		
		System.out.println("Constituence, Winning Party, Vote Share");
		Scanner sc = new Scanner(fObj);
		while(sc.hasNextLine()) {
			String line = sc.nextLine();
			
				String[] words = line.split("-"); 
				System.out.print(words[0]+", ");	//city name
			
				
				String[] parties = words[1].split(","); 
					
					String[] cp = parties[0].split("="); 
					String party = cp[0];
					Double ms = Double.parseDouble(cp[1]);
					Double total = ms;
					
					for(int i=1; i<parties.length; i++) { 
						cp = parties[i].split("="); //each party
						Double cs = Double.parseDouble(cp[1]);
						if(ms < cs) {
							ms = cs;
							party = cp[0];
							total += cs;
						}
					}
			if(party.equals("BJP")) {
				party = "Bhartiya Janta Party";
			}
			else if(party.equals("INC")) {
				party = "Indian National Congress";
			}
			else if(party.equals("BSP")) {
				party = "Bahujan Samaj Party";
			}
			else if(party.equals("CPI")) {
				party = "Communist Party of India";
			}
			else if(party.equals("NCP")) {
				party = "Nationalist Congress Party";
			}
			else {
				party = "Independnt";
			}
			System.out.print(party+", "+(ms*100/total)+"\n");
		}
		sc.close();
		*/
	}

}
