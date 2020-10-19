package com.syntax.class03;

public class RelationalOperators {
	
	public static void main(String[] args) {
		
		int a=10;
		int b=15;
		System.out.println(a>b);// false
		System.out.println(a<b);// true
		System.out.println(a==b); // false
		System.out.println(a!=b);// true
		
		int x=100;
		int y=90;
		
		boolean result=x>y;
		result=x==y;
		System.out.println(result);
		
		System.out.println(x==y); //compare two values -output:false
		System.out.println(x=y); // here you assign value of y to x, and now x=90
		System.out.println(x);
		
		boolean result1=x==y;
		System.out.println(result1);
		
		byte num=10;
		byte num1=10;
		boolean boo=num>num1;
		System.out.println(boo);// false
		boolean boo1=num>=num1;
		System.out.println(boo1);// true, since it is equal
		
		
	}
		
	}  

	
	