package com.logical;

import java.io.*;

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
    
    pw.println(" sum : " + obj.sum(1) );
    pw.println(" sum : " + obj.sum(1,2) );
    pw.println(" sum : "+ obj.sum(1,2,3,4,5,6));
}
}