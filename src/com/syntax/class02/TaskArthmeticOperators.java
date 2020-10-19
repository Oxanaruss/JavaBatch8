package com.syntax.class02;

public class TaskArthmeticOperators {

	public static void main(String[] args) {
	/*
	 * Three Task 
	 * 
1.	Write a Java program to add, subtract, multiply and divide 2 decimal values. 
    Your program should say. “The _______ of 2 numbers ___ and ___ is equal to _____”	

	 */
		double num1, num2;
		num1=4.55;
		num2=8.55;
		
		double add=num1+num2;
		double sub=num2-num1;
		double mul=num1*num2;
		double div=num2/num1;
		System.out.println("The result of addition of 2 double numbers = "+add);
		System.out.println("The result subtraction of 2 double numbers = "+sub);
		System.out.println("The result of multiplication of 2 double numbers = "+mul);
		System.out.println("The result of division of 2 double numbers = "+div);
		
	// 2.	Write a program to find the square of the number 3.9. 
	   
	    double squ1=3.9;
	    double squ2= squ1*squ1;
	    System.out.println("The square of squ1 = "+squ2);
	    
  // 3. Write a program to print the area and perimeter of a rectangle with width = 5 and  hight = 8.s
	  

	    int width=5;
	    int hight=8;
	    int perimeter=width*2+hight*2;
	    System.out.println("The perimeter of a rectangle with width "+ width+" and hight "+hight+"="+ perimeter);
		
		
	}		
		
}
