import java.util.*;
import java.io.*;
public class GenericDemo {
   
   public static void main(String args[]) {
         Scanner sc = new Scanner(System.in);   // to take input
         PrintWriter pr = new PrintWriter(System.out,true);    // to print on console
         
         // declaring arrays of wrapup classes
         Integer[] in = { 5,1,3,4,2};
         Double[] db = new Double[5];
         Character[] ch = new Character[5];
         
         // innitializing arrays
         
         pr.println("\n Enter 5 double values");
         for( int i = 0; i < 5; i++) 
               db[i] = sc.nextDouble();
         pr.println("\n Enter 5 characters");
         for( int i = 0; i < 5; i++) 
               ch[i] = sc.next().charAt(0);	
      
         // Sorting elements in arrays
         Arrays.sort(in);
         Arrays.sort(db);
         Arrays.sort(ch);
         
        //print elements of array 
        printArray(in);
        printArray(db);
        printArray(ch);
        

  }
  public static <T>  void printArray( T[] inputele) {
         for( T ele : inputele )
              System.out.printf(" %s",ele);
               System.out.println();
  }
}