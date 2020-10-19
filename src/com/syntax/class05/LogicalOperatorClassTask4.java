package com.syntax.class05;

import java.util.Scanner;

public class LogicalOperatorClassTask4 {

	public static void main(String[] args) {
		/*
		 * Write a program for user to enter his/hers birth month. Based on the month
		 * define the season. Example: if user is born in June, July or August → season
		 * =”Summer”. At the end of the program we should see output as “You were
		 * born______”.
		 */

		Scanner input;
		String month;
		String season;
		input = new Scanner(System.in);
		System.out.println(" Please, enter your birth month");

		month = input.next();
		if (month.equalsIgnoreCase("June") || month.equalsIgnoreCase("July") || month.equalsIgnoreCase("August")) {
			System.out.println(" You were born in summer"); // season="Summer" before create String season

		} else if (month.equalsIgnoreCase("January") || month.equalsIgnoreCase("February")
				|| month.equalsIgnoreCase("December")) {
			System.out.println(" You were born in winter");

		} else if (month.equalsIgnoreCase("September") || month.equalsIgnoreCase("October")
				|| month.equalsIgnoreCase("November")) {
			System.out.println(" You were born in fall");

		} else if (month.equalsIgnoreCase("March") || month.equalsIgnoreCase("Apri;")
				|| month.equalsIgnoreCase("May")) {
			System.out.println(" You were born in Spring");
		} else {
			season = "invalid";
			System.out.println(" Entry is invalid");
		}

	}
}
