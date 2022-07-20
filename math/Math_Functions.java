import java.io.*;
import java.util.*;
public class Math_Functions {
   public static void main(String args[]) {
            PrintWriter pw = new PrintWriter(System.out,true);
        Scanner sc = new Scanner(System.in);
        pw.println("Enter 2 numbers");
        int no1 = sc.nextInt();
        int no2 = sc.nextInt();
        pw.println("Minimum number : "+ Math.min(no1, no2));
        pw.println("Maximum numbe : "+ Math.max(no1, no2));
        pw.println("Square :"+Math.pow(no1,2));
        pw.println("SquareRoot :"+Math.sqrt(no1));
   }
}