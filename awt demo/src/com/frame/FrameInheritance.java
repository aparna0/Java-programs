package com.frame;

import java.awt.Frame;
import java.awt.Label;


public class FrameInheritance extends Frame{
	FrameInheritance(){
	
		Label l1 = new Label("Aparna");
		l1.setBounds(100, 100, 40, 20);
		add(l1);
		Label l2 = new Label("Chakrapani");
		l2.setBounds(150, 100, 70, 20);
		add(l2);
		Label l3 = new Label("Mangalaram");
		l3.setBounds(230, 100, 80, 20);
		add(l3);
		
		setTitle("creating frame by extending Frame class");
		setLayout(null);
		setVisible(true);
		setSize(500,500);
	}

	public static void main(String[] args) {
		FrameInheritance fo = new FrameInheritance();

	}

}
