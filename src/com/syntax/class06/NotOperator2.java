package com.syntax.class06;

import java.util.Scanner;

public class NotOperator2 {

	public static void main(String[] args) {
		Scanner input;
		double num1, num2, num3, large;
		input = new Scanner(System.in);
		System.out.println("Please, enter three double value");
		num1 = input.nextDouble();
		num2 = input.nextDouble();
		num3 = input.nextDouble();

		if (!(num1 == num2 && num1 == 3)) {
			if (num1 > num2 && num1 > 3) {
				large = num1;
			} else if (num2 > num3) {
				large = num2;
			} else {
				large = num3;
			}
			System.out.println("Largest value is " + large);

		} else {
			System.out.println("Nubers are equal");

		}
	}
}