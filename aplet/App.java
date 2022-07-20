import java.awt.*;
import java.applet.*;
//<applet code="App.class" height=220 width=220></applet>
public class App  extends Applet
{
String Str= " ";
public void init()
 {
   Str +="init";
System.out.println("init");
}

public void start()
 {
   Str +="start";
System.out.println("start");
}
public void paint(Graphics g)
 {
   Str +="paint";
g.drawString(Str,100,100);
}
public void stop()
 {
   Str +="stop";
System.out.println("stop");
}

public void distroy()
 {
   Str +="stop";
System.out.println("distroys");
}
}