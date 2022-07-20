package com.logical;

import java.util.*;
class Pattern
{
public static void main(String args[])
 {
   Scanner sc=new Scanner(System.in);
  int  no=sc.nextInt();
int k;
     for(int i=1;i<=no;i++)
        {
	k=i;
	System.out.print(k);
	//for(int j=1;j<=no;j++)
	//{
	   k=2;
	   System.out.print(k);
	    k++;
	    while(k!=no)
	  {
		System.out.print(k);
		k++;
                    }
	if(k==no)
	{
		while(k>=2)
		{
			System.out.print(k);k--;
		}
	}
		System.out.print(i);
	//}
 	System.out.print("\n");
    }
     sc.close();
}
}