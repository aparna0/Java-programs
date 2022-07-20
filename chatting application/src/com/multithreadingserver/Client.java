package com.multithreadingserver;

import java.io.*;
import java.net.*;
import java.util.Scanner;

public class Client {

	public static void main(String[] args) {
		
		String host;
		Socket s;
		InputStream is;
		OutputStream os;
		DataInputStream dis;
		DataOutputStream dos;
		Scanner sc = new Scanner(System.in);
		try {
			InetAddress ai = InetAddress.getLocalHost();
			host = ai.getHostName();
			s = new Socket(host,6000);
			is = s.getInputStream();
			os = s.getOutputStream();
			dis = new DataInputStream(is);
			dos = new DataOutputStream(os);
			
			while(true) {
				String name;
				System.out.println("enter your name");
				name = sc.next();
				dos.writeUTF(name);
				name = dis.readUTF();
				System.out.println(name);
			}
		} catch (Exception e) {
			
			e.printStackTrace();
		}

	}

}
