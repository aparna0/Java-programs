package com.mycompany.hello;
import java.io.File;
//import java.io.FileWriter;
import java.io.FileInputStream;
import java.io.InputStream;
import java.awt.*;
import javax.swing.*;

import edu.cmu.sphinx.api.Configuration;
import edu.cmu.sphinx.api.SpeechResult;
import edu.cmu.sphinx.api.StreamSpeechRecognizer;
import java.awt.Container;
public class hello {      
    public static void main(String[] args) throws Exception 
    {
       Configuration con = new Configuration();

        con.setAcousticModelPath("resource:/edu/cmu/sphinx/models/en-us/en-us");
        con.setDictionaryPath("resource:/edu/cmu/sphinx/models/en-us/cmudict-en-us.dict");
        con.setLanguageModelPath("resource:/edu/cmu/sphinx/models/en-us/en-us.lm.bin");

	StreamSpeechRecognizer recognizer = new StreamSpeechRecognizer(con);
	InputStream stream = new FileInputStream(new File("test.wav"));

        recognizer.startRecognition(stream);
	SpeechResult result;
	while ((result = recognizer.getResult()) != null) {
	    
            ta.setText(result.getHypothesis());
     }
         
        JFrame f=new JFrame();
        f.setVisible(true);
        f.setSize(500,500);
       f.setResizable(true);
        f.setLayout(null);
     JPanel px=new JPanel();
     ImageIcon img=new ImageIcon("p1.jpeg");
      Image img1=img.getImage();
        Image img2=img1.getScaledInstance(500, 500, Image.SCALE_SMOOTH);
        ImageIcon img3=new ImageIcon(img2);
       
     px.setBounds(0,0,500,500);
     JLabel lx=new JLabel(img3);
        Container c=f.getContentPane();
        lx.setBounds(0,0,500,500);
        JPanel p1=new JPanel();
        lx.add(p1);
        p1.setBounds(0,0,500,100); 
        
        JLabel jb1=new JLabel(new ImageIcon("project.jpg"));
        JLabel jb2=new JLabel("AUDIO TO TEXT");
        p1.setBackground(new Color(0,0,0,50));
        
        p1.add(jb1);
        jb1.setBounds(0,0,180,180);
        p1.add(jb2);        
        jb2.setBounds(200,10,300,130);
        jb2.setFont(new Font("serif",Font.BOLD,30));
        
        //JSeparator js=new JSeparator();
        //c.add(js);
        
        JTextArea ta=new JTextArea();
        lx.add(ta);
        ta.setBounds(50,200,350,100);
         // ta.setBackground(new Color(250,250,250,20));
        ta.setFont(new Font("serif",Font.BOLD,24));
        px.add(lx);
        c.add(px);
         
       f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	recognizer.stopRecognition();
    }
    }
