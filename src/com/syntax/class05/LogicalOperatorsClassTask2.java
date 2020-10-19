package com.syntax.class05;

import java.util.Scanner;

public class LogicalOperatorsClassTask2 {

	public static void main(String[] args) {
		/*
		 * Write a program that will print whether it is a weekend or weekday. If any
		 * day from 1-5 → output “It is a weekday”, any day from 6-7 → output “It is a
		 * weekend”, any other day → output “Invalid day"
		 */

		Scanner scan = new Scanner(System.in);
		System.out.println("Please enter today's day using numbers from 1-7");
		int today = scan.nextInt();
		if (today == 1 || today == 2 || today == 3 || today == 4 || today == 5) {
			System.out.println("It's a week day");
		} else if (today == 6 || today == 7) {
			System.out.println("It's weekend");
		} else {
			System.out.println("Please, enter valid day from 1-7");
		}

	}
}
