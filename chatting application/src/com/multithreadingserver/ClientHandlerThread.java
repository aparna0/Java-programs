package com.multithreadingserver;

import java.net.Socket;
import java.io.*;
public class ClientHandlerThread implements Runnable{
	Socket s;
	ClientHandlerThread(Socket s){
		this.s = s;
	}

	public static void main(String[] args) {}

	@Override
	public void run() {
		InputStream is;
		DataInputStream dis;
		try {
			while(true) {
				is = s.getInputStream();
				dis = new DataInputStream(is);
				String clientdata = dis.readUTF();
				System.out.println("Hello client : "+clientdata);
			}
		}catch(Exception e) {}
	}

}
