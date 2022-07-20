package com.multithreadingserver;

import java.net.*;

public class Server {
	
	public static void main(String[] args) {
		ServerSocket ss = null;
		try {
			ss = new ServerSocket(6000);
			ss.setReuseAddress(true);
			
			while(true) {
				Socket s;
				s = ss.accept();
				ClientHandlerThread clientS = new ClientHandlerThread(s);
				new Thread(clientS).start();
			}
			
		}catch(Exception e){
			System.out.println(e);
		}
		
	}

}
