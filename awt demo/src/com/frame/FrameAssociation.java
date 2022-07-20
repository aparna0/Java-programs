package com.frame;

import java.awt.Frame;
import java.awt.Label;

public class FrameAssociation {
	FrameAssociation(){
		Frame fo = new Frame();
		fo.setTitle("creating frame by extending Frame class");
		fo.setLayout(null);
		fo.setVisible(true);
		fo.setSize(500,500);
		
		Label l1 = new Label("Aparna");
		l1.setBounds(100, 100, 40, 20);
		fo.add(l1);
		Label l2 = new Label("Chakrapani");
		l2.setBounds(150, 100, 70, 20);
		fo.add(l2);
		Label l3 = new Label("Mangalaram");
		l3.setBounds(230, 100, 80, 20);
		fo.add(l3);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		FrameAssociation obj = new FrameAssociation();
	}

}
