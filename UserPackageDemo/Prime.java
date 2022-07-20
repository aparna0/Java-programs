import java.io.*;
import java.util.*;
public class Prime {
   public static void Prime(int start, int end) throws IOException{
      
      for( int i = start; i <= end; i++) {
          
           int flag= 0;
           for(int j = 2; j <= (i/2); j++) {
                 if( i % j == 0 ) {
                    flag = 1;
                    break ; 	
                     
                 }
           }
            if( flag != 1 ) {
            System.out.println(i);
       
            }
      }
}
   public static void main(String args[]) {
    
   
    
     Scanner sc = new Scanner(System.in);
     pw.println("Program to find prime between given range");
     System.out.println("Enter start of range") ;
     int start = sc.nextInt();
     pw.println("Enter end of range") ;
     int end =  sc.nextInt();
         prime(start,end);
   
  }
}