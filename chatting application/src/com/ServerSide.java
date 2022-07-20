package com;

import java.awt.Button;
import java.awt.Font;
import java.awt.Frame;
import java.awt.TextArea;
import java.awt.TextField;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.InetAddress;
import java.net.ServerSocket;
import java.net.Socket;

public class ServerSide implements ActionListener{
	Frame fo;
	TextArea ta;
	TextField tf;
	Button b;
	
	ServerSocket ss;
	Socket s;
	InputStream is;
	OutputStream os;
	DataInputStream dis;
	DataOutputStream dos;
	
	
	ServerSide(){
		fo = new Frame();
		fo.setTitle("server app");
		fo.setLayout(null);
		fo.setVisible(true);
		fo.setSize(500,500);
		
		Font font = new Font("SansSerif", Font.BOLD, 25);
		
		ta = new TextArea();
		ta.setBounds(50,50,400,300);
		ta.setFont(font);
		fo.add(ta);
		
		tf = new TextField();
		tf.setBounds(50,400,300,50);
		tf.setFont(font);
		fo.add(tf);
		
		b = new Button("send");
		b.setBounds(400, 410, 80, 30);  
		b.addActionListener(this);
		fo.add(b);
		
		try {
			ss = new ServerSocket(6000);
	        s = ss.accept();
			is = s.getInputStream();
			os = s.getOutputStream();
			dis = new DataInputStream(is);
			dos = new DataOutputStream(os);
			
			while(true) {
				String smsg = dis.readUTF();
				smsg = "client : " + smsg + "\n" ;
				ta.append(smsg);
			}
		} catch (Exception e) {
			
			e.printStackTrace();
		}
		
	}
	
	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		String msg;
		msg =  tf.getText();
		msg = "you : " + msg + "\n";
		ta.append(msg);
		
		try {
			dos.writeUTF(tf.getText());
		} catch (IOException e1) {
			e1.printStackTrace();
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ServerSide server = new ServerSide();
	}

	

}
