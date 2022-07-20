import java.io.*;
//import java.util.*;
public class PrimeNo {
   public static int prime(int start, int end) throws IOException{
      int sum = 0;
      for( int i = start; i <= end; i++) {
          
           int flag= 0;
           for(int j = 2; j <= (i/2); j++) {
                 if( i % j == 0 ) {
                    flag = 1;
                    break ; 	
                     
                 }
           }
            if( flag != 1 ) {
            //System.out.println(i);
             sum +=i;
            }
      }
   return sum;
  }
   public static void main(String args[]) {
    
     try {
     PrintWriter pw = new PrintWriter(System.out,true);
     DataInputStream in = new DataInputStream(System.in);
     //Scanner sc = new Scanner(System.in);
     pw.println("Program to find prime between given range");
     pw.println("Enter start of range") ;
     int start = Integer.parseInt(in.readLine());
     pw.println("Enter end of range") ;
     int end = Integer.parseInt(in.readLine());
          pw.println( prime(start,end));
     }
    catch(IOException e) { }
  }
}