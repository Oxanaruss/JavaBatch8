package com.syntax.class05;

import java.util.Scanner;

public class HW {

	public static void main(String[] args) {
		/*
		 * Write a program to find largest of three double values using if-else..if and
		 * logical operators provided by a user (numbers must be distinct)
		 */
		Scanner input;
		double num1, num2, num3, large;
		input = new Scanner(System.in);
		System.out.println("Please, enter three double value");
		num1 = input.nextDouble();
		num2 = input.nextDouble();
		num3 = input.nextDouble();
		if (num1 > num2 && num1 > 3) {
			large = num1;
		} else if (num2 > num1 && num2 > num3) {
			large = num2;
		} else {
			large = num3;
		}
		System.out.println("The largest number is " + large);
	}

}
