import operations.Cal;
import java.util.*;
public class PackageDemo {
  public static void main(String args[]) {
      Scanner sc = new Scanner(System.in);
      System.out.println("\n Enter two values for calculations : \t  ");
      int no1 = sc.nextInt();
      int no2 = sc.nextInt();
      Cal obj = new Cal(); 
      System.out.println(" Addition : "+obj. add(no1,no2));
  }
}