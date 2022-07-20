package com.logical;

import java.util.*;

public class Prime {
 public void prime(int start, int end) {
      
      for( int i = start; i <= end; i++) {
          
           int flag= 0;
           for(int j = 2; j <= (i/2); j++) {
                 if( i % j == 0 ) {
                    flag = 1;
                    break ; 	
                 }
           }
            if( flag != 1 ) 
                  System.out.println(i);
      }
 }
 public static void main(String args[]) {
      Scanner sc = new Scanner(System.in);
      Prime obj = new Prime();
      System.out.println("Program to find prime between given range");
     System.out.println("Enter start of range") ;
     int start = sc.nextInt();
     System.out.println("Enter end of range") ;
     int end =  sc.nextInt();
     obj.prime(start,end);
     sc.close();
 } 
}