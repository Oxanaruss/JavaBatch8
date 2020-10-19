package com.syntax.class06;

import java.util.Scanner;

public class NotOperatorThursdayReview2Calculator {

	public static void main(String[] args) {
		/*
		 * HomeWork: Using scanner class create calculator. Allow user to enter 2
		 * numbers and operator(+,-,*,/). Based on operator provide the result to user.
		 * 
		 */
		int num1;
		int num2;
		char operation;
		int results = 0;

		String phone = "123-458-785";

		Scanner scan = new Scanner(System.in);
		System.out.println("Please enter two numbers");

		num1 = scan.nextInt();
		num2 = scan.nextInt();
		System.out.println("Please enter the operation + - * /");

		operation = scan.next().charAt(0);

		if (operation == '+') {
			results = num1 + num2;
		} else if (operation == '-') {
			results = num1 - num2;
		} else if (operation == '*') {
			results = num1 * num2;
		} else if (operation == '/') {
			results = num1 / num2;
		} else {
			System.out.println("Invalid Operation");
		}
		System.out.println(results);

		System.out.println("----------switch example----");
		switch (operation) {
		case ('+'):
			results = num1 + num2;
			break;
		case ('-'):
			results = num1 - num2;
			break;
		case ('*'):
			results = num1 * num2;
			break;
		case ('/'):
			results = num1 / num2;
			break;
		default:
			System.out.println("Invalid Operation");

		}

		if (results != 0) {
			System.out.println(results);
		}
	}

}
