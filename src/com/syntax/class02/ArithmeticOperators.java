package com.syntax.class02;

public class ArithmeticOperators {

	public static void main(String[] args) {
		
		// Arithmetic Operators: +. -, *, /, %
		
		int num1, num2;
		
		num1=10;
		num2=12;
		System.out.println(num1+num2); 
		System.out.println(num2-num1);
		System.out.println(num1*num2);
		System.out.println(num1/num2);
		
		double num3=10.99;
		double  num4=2.99;
		double mult=num3*num4;
		// you can print the operation, but better to store the operation in variable to use in the future
		
		System.out.println(mult);
		
		double div=num3/num4;// division of decimal numbers
		
		System.out.println(div);//3.6755852842809364
		System.out.println("The result of division of 2 double numbers = "+div);
		
		// Let's take float and compare it with double with same values/numbers
		
		float f=10.99f;
		float f1=2.99f;
		System.out.println("The result of division of 2 float numbers = "+f/f1);
		
		
		System.out.println(f/f1);// 3.6755853
		
	}

}
