package com.syntax.class04;

import java.util.Scanner;

public class HomeTasksRepl {

	public static void main(String[] args) {
		/*
		 * Write a program to find the largest number among three distinct numbers using
		 * nested if condition Please use Scanner class to take input from users
		 * 
		 * Expected Output: Please enter 3 distinct numbers 4 5 and 14 The largest
		 * number is 14 .
		 */

		Scanner input = new Scanner(System.in);

		System.out.println("Enter three numbers");

		int num1 = input.nextInt();
		int num2 = input.nextInt();
		int num3 = input.nextInt();
		if (num1 > num2 && num1 > num3) {
			System.out.println("The largest number is " + num1);
		} else if (num2 > num1 && num2 > num3) {
			System.out.println("The largest number is " + num2);
		} else {
			System.out.println("The largest number is " + num3);
		}

	}
}
