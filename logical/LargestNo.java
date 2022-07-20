import java.util.*;
import java.io.*;
public class LargestNo {
  public static void main(String args[]) {
      int ch, max , a, b, c;
      PrintWriter pw = new PrintWriter(System.out,true);
      Scanner sc = new Scanner(System.in);
      do {
            pw.println(" Enter 3 numbers ");
            a = sc.nextInt();
            b = sc.nextInt();
            c = sc.nextInt();
            max = ( a > b) ? ( a > c ? a : c ) : ( b > c ? b : c);
            pw.println(" Largest number among 3 numbers : "+ max);
            pw.println(" Do you want to continue \n 1.Yes \t 0.No");
            ch = sc.nextInt();
      }while( ch != 0 );
  }
}