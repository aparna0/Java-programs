import java.io.*;
import java.util.*;
public class InputStreamDemo {
public static void main(String args[]) throws IOException {

PrintWriter pw = new PrintWriter(System.out,true);
DataInputStream in = new DataInputStream(System.in);
pw.println("Enter starting range ");
int start = Integer.parseInt(in.readLine());
pw.println("Enter end of range ");
int end = Integer.parseInt(in.readLine());
//pw.println(start);

int flag = 0 , i , j;
for( i = start; i <= end; i++ )  {
      for( j = 2;  j < i; j++ ) {
              if(  i % j == 0 )  {
                  flag ++;
                  continue;
              }
      }
      if( flag == 0)   {
           pw.println(i);
           flag = 0;
     }
}     
}
}