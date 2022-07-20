import java.awt.*;
import java.applet.*;
import java.awt.event.*;
//<applet code = "VottingSys.java" height = 700 width = 700></applet>

public class VottingSys extends Applet implements ActionListener{
Label l1,name,id,zender,l2,l3,l4;
TextField nt,idt;
Choice gch,vot;
Button submit1,submit2,submit3;
//CheckboxGroup cbg;
//Checkbox ch1,ch2,ch3,ch4,ch5,ch6;
public void init() {

l1 = new Label("WELCOME TO VOTTING SYSTEM ");
l1.setBounds(50,20,200,50);
add(l1);


idt = new TextField();
idt.setBounds(200,140,150,30);
add(idt);
//label
zender = new Label("Zender ");
zender.setBounds(20,180,60,30);
add(zender);
gch = new Choice();
gch.add("      ");
gch.add("Female");
gch.add("Male");
gch.add("other");
gch.setBounds(200,180,60,30);
add(gch);

submit1 = new Button("SUBMII");
submit1.setBounds(100,500,100,50);
submit1.addActionListener(this);
add(submit1);

submit2 = new Button("SUBMII");
submit2.setBounds(100,600,100,50);
submit2.addActionListener(this);
add(submit2);
submit2.setVisible(false);


submit3 = new Button("ADD USER");
submit3.setBounds(250,600,100,50);
submit3.addActionListener(this);
add(submit3);
submit3.setVisible(false);


l3 = new Label("Select any one ... ");
l3.setBounds(100,250,150,30);
add(l3);
l3.setVisible(false);

vot = new Choice();
vot.add("      ");
vot.add("BJO");
vot.add("congrace");
vot.add("Shiv-sena");
vot.setBounds(200,300,100,30);
add(vot);
vot.setVisible(false);

name = new Label("Enter your name");
name.setBounds(20,90,150,30);
add(name);
nt = new TextField();
nt.setBounds(200,100,150,30);
add(nt);

id = new Label("Enter your votter Id ");
id.setBounds(20,140,150,30);
add(id);
setLayout(null);			
}


public void actionPerformed(ActionEvent e) {
if(e.getSource() == submit1) {
System.out.println("SUCCESSFUL.....");
submit1.setVisible(false);
vot.setVisible(true);
l3.setVisible(true);
submit2.setVisible(true);
}
else {
if(e.getSource()==submit3)
{
nt.setText(" ");
idt.setText("  ");
nt.setEditable(true);
idt.setEditable(true);
vot.setEnabled(true);
gch.setEnabled(true);
submit3.setEnabled(true);
}
else
{
nt.setEditable(false);
idt.setEditable(false);
vot.setEnabled(false);
gch.setEnabled(false);
submit3.setVisible(true);
}}
}
} 