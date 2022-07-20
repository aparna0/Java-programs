import java.io.*;
import UserPackageDemo.*;  
public class VariableLengthArgument {
    int sum(int...a){
         int sum = 0;
         for( int x : a )
               sum +=  x;
         return sum;
    }
public static void main(String args[]) {
    PrintWriter pw = new PrintWriter(System.out, true);
    VariableLengthArgument   obj = new VariableLengthArgument();
    UserPackageClass  obj2 = new UserPackageClass();
    pw.println(" sum : " + obj.sum(1) + "  Min : " + obj2.min(1));
    pw.println(" sum : " + obj.sum(1,2) + "  Min : " + obj2.min(1,2));
    pw.println(" sum : "+ obj.sum(1,2,3,4,5,6) + "Min : " + obj2.min(1,2,3,4,5,6));
}
}