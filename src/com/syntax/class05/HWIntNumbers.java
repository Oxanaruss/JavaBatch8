package com.syntax.class05;

import java.util.Scanner;

public class HWIntNumbers {

	public static void main(String[] args) {
		Scanner input;
		int num1, num2, num3, largestnum;

		input = new Scanner(System.in);
		System.out.println("Please, enter three distinct numbers");
		num1 = input.nextInt();
		num2 = input.nextInt();
		num3 = input.nextInt();
		if (num1 > num2) {
			if (num1 > 3) {
				System.out.println("largest " + num1);
			}
		} else if (num2 > num1) {
			if (num2 > num3) {
				System.out.println("largest " + num2);
			} else {
				System.out.println("largest " + num3);
			}
		}
	}
}
