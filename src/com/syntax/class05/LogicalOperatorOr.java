package com.syntax.class05;

import java.util.Scanner;

public class LogicalOperatorOr {

	public static void main(String[] args) {

		String day = "Wednesday";
		if (day.equals("Sunday") || day.equals("Saturday")) {
			System.out.println("Today I have a Jave class at Syntax");
		} else {
			System.out.println("No Sytnax today");
		}

		// example 2
		/*
		 * if day is 1 or 5 - day off Syntax if day 2 or 3 - Syntax class if day 4
		 * -review class if day 6 or 7 - Java class anything else will be invalid day
		 */

		Scanner input = new Scanner(System.in);
		System.out.println("Please enter todays day using numbers from 1-7");
		int today = input.nextInt();
		if (today == 1 || today == 5) {
			System.out.println("I'm off from Syntax");
		} else if (today == 2 || today == 3) {
			System.out.println("I have Syntas class");
		} else if (today == 4) {
			System.out.println("I have review class");
		} else if (today == 6 || today == 7) {
			System.out.println("I have Java class");
		} else {
			System.out.println("Please, enter valid day from 1-7");

		}

	}
}
