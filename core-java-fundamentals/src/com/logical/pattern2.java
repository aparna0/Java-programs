package com.logical;

import java.util.Scanner;

public class pattern2 {

	public static void main(String[] args) {
		int n,m,i,j,t=0,x;
		char ch[] = {'W','E','L','C','O','M','E'};
		Scanner sc = new Scanner(System.in);
		n = sc.nextInt();
		m = sc.nextInt();
		//System.out.println(nm);
		 for( i=0;i<n;i++) {
			 x = i;
			 if(i>n/2)
				 x = (n-1) - i;
			 for( j=1;j<m;j++) {
				
				 if(i==n/2) {
					 if(j>=n && t<=6) {
						 System.out.print(ch[t++]); 
					 }
					 else {
						 System.out.print('-');
					 }
				 }
				 
				 
				 
				 else if( j>=Math.abs((m/2)-(i*3+1)) &&  j<=((m/2)+(x*3+1))) {
					 if(((m/2)-j)%3==0 || (j-(m/2))%3==0)
						 System.out.print("|"); 
					 else
						 System.out.print(".");
				 }
				 else {
					 System.out.print('-');
				 }
				 System.out.print(' ');
			 }
			 System.out.print('\n');
		 }
	}

}
