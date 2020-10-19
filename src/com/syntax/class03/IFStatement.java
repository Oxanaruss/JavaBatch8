package com.syntax.class03;

public class IFStatement {

	public static void main(String[] args) {
	int num1=1800;
	int num2=900;
	System.out.println("writing my first if statement");
	
	if(num1>num2) {
		System.out.println("num1 is bigger than num2");// this line will be printed only if condition is true
	}
        System.out.println("End of if statement");// this line will be printed without a condition
        
        int temp=70;
        if(temp>=70) {
        	System.out.println("I am going to the beach");
        }else {
        	System.out.println("I'll go for a walk");
        }
        	double expectedHours=15;
        	double actualHours=2;
        	
        	if(actualHours>expectedHours) {
        		System.out.println("You will succeed");// if true -that the result you'll see
        	}
        	else {
        		System.out.println("Course will be too hard for you");//If coundition is false than you'll see it
        }
	}

}
