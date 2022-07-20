import java.net.*;
import java.io.*;
import java.util.*;
public class TcpClient1 {
public static void main(String args[]) {
     try {
         Scanner sc = new Scanner(System.in);
         InetAddress ia = InetAddress.getLocalHost();
         String host = ia.getHostName();
         
         Socket s1 = new Socket(host,6000);
         InputStream is1 = s1.getInputStream();
         OutputStream os1= s1.getOutputStream();
         DataInputStream dis1 = new DataInputStream(is1);
         DataOutputStream dos1 = new DataOutputStream(os1);
    BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
         while( true ) {
           String str2=dis1.readUTF();

     System.out.println("\nmassage from server : "+str2);          
      System.out.println("\nEnter the messge:-");
           String c1=br.readLine();
dos1.writeUTF(c1);
             }
   }
   catch(Exception e) { }

 }
}