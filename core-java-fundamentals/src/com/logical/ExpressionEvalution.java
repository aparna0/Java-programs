package com.logical;

import java.util.Scanner;
import java.util.Stack;

public class ExpressionEvalution {
	static Stack<Float> values = new Stack<Float>();		
	static Stack<Character> ops = new Stack<Character>();
	
	public static float evaluate(String expression) {
		
		
		char[] exp = expression.toCharArray();
		int i = 0;
		while(i < exp.length) {
			
			System.out.println("current char is"+exp[i]);
			
			if(exp[i] == ' ') {
				
				continue;
			}
			else if(exp[i] >= '0' && exp[i] <= '9') {
				//System.out.println("it is number");
				//float val = 0.0f;
				StringBuffer val = new  StringBuffer();
				while(i < exp.length && ( (exp[i] >= '0' && exp[i] <= '9') || exp[i] == '.')) {
					
					val.append(exp[i++]);
				}
				String v = val.toString();
				Float pval = Float.parseFloat(v);
				System.out.println("current float value is "+pval);
				values.push(pval);
				i--;
			}
			else {
				System.out.println("it is operator");
				if(ops.empty()) {
					ops.push(exp[i]);
				}
				else {
					char preop;
					preop  = ops.pop();
					System.out.println("pre priop "+priority(preop)+"cur pro "+priority(exp[i]));
					while( priority(preop) >= priority(exp[i]) ) {
						System.out.println("pop and push");
						values.push(getResult(preop));
						if(ops.empty())  break;
						preop  = ops.pop();
					}
					if( (priority(preop) < priority(exp[i]))  )
						ops.push(preop);
					ops.push(exp[i]);
				}
				
			}
			i++;
		}
		System.out.println(ops);
		while(!ops.empty()) {
			System.out.println(values);
			System.out.println(ops);
			values.push(getResult(ops.pop()));
		}
		return values.pop();
	}
	
	public static int priority(char op) {
		int pri = 0;
		if(op == '%' || op == '*' || op == '/')
			pri =  2;
		if(op == '+' || op == '-' )
			pri =  1;
		return pri;
	}
	
	public static float getResult(char op) {
		
		float b = values.pop();
		float a = values.pop();
		float res = 0;
		switch(op) {
		case '%':
			res = a % b;
			break;
		case '/':
			res = a / b;
			break;
		case '*':
			res = a * b;
			break;
		case '+':
			res = a + b;
			break;
		case '-':
			res = a - b;
			break;
		}
		System.out.println("res "+res);
		return res;
	}

	public static void main(String[] args) {
		System.out.println("Enter expression");
		String exp;
		Scanner sc = new Scanner(System.in);
		exp = sc.next();
		System.out.println(exp);
		
		System.out.println(evaluate(exp));
	}

}
