import java.net.*;
import java.util.*;
import java.io.*;
public class TcpServer {
public static void main(String args[])  {
  try {

         ServerSocket ss = new ServerSocket(6000);
         Socket s1 = ss.accept();
         InputStream is1 = s1.getInputStream();
         OutputStream os1= s1.getOutputStream();
         DataInputStream dis1 = new DataInputStream(is1);
         DataOutputStream dos1 = new DataOutputStream(os1);
    
      /*  Socket s2 = ss.accept();
        InputStream is2 = s2.getInputStream();
         OutputStream os2= s2.getOutputStream();
         DataInputStream dis2 = new DataInputStream(is2);
         DataOutputStream dos2 = new DataOutputStream(os2);*/
  BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
         while( true ) {
        
           System.out.println("\nConnection is build : ");
      
           System.out.println("\nEnter message to broadscast: ");
           {   String str = br.readLine();
              dos1.writeUTF(str);
           //dos2.writeUTF(str);}
              String l1=dis1.readUTF();
	System.out.println("\nMessage from client 1:-\n"+l1);
             //String l2=dis2.readUTF();
	//System.out.println("\nMessage from client 2:-\n"+l2);

         }
   }
 catch(Exception e) { }

 }
}