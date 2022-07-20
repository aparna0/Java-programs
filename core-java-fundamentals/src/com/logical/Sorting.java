package com.logical;

import java.util.*;
public class Sorting {
  public static void main(String args[]) {
     Scanner sc = new Scanner(System.in);
     System.out.println("\nEnter array size ");
     int no = sc.nextInt(), ch;
    int[] a = new int[no];
    System.out.println("Enter "+ no + "  Elements");
   for( int i=0; i<a.length ; i++)
        a[i] = sc.nextInt();
  do {
      System.out.println("\n1.Ascending\n2.descending\n3.Exit\nEnter your choice");
      ch = sc.nextInt(); 
      switch(ch){
         case 1: for(int i=0; i<no ; i++) {
                          for(int j =i+1; j<no ; j++){
                               if( a[i] > a[j]) {
                                    int t = a[i];
                                    a[i] = a[j];
                                     a[j] = t;
                               }  
                          }
                       } 
                      
                      for( int i=0; i<a.length; i++)
                            System.out.println(a[i]);
                      break;
         case 2:for(int i=0; i<no ; i++) {
                          for(int j =i+1; j<no ; j++){
                               if( a[i] > a[j]) {
                                    int t = a[i];
                                    a[i] = a[j];
                                     a[j] = t;
                               }  
                          }
                       } 
                      
                      for( int i=0; i<a.length; i++)
                            System.out.println(a[i]);
                     break;
         case 3:break;
      }
  }while(ch != 3);
  sc.close();
 }
}