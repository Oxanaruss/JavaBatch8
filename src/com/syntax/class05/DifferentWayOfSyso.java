package com.syntax.class05;

import java.util.Scanner;

public class DifferentWayOfSyso {

	public static void main(String[] args) {
		// compare with LogicalOperatorClassTask4

		Scanner input;
		String month;
		String season;

		input = new Scanner(System.in);
		System.out.println(" Please, enter your birth month");
		month = input.next();
		if (month.equalsIgnoreCase("June") || month.equalsIgnoreCase("July") || month.equalsIgnoreCase("August")) {

			season = "Summer";

		} else if (month.equalsIgnoreCase("January") || month.equalsIgnoreCase("February")
				|| month.equalsIgnoreCase("December")) {
			season = "Winter";

		} else if (month.equalsIgnoreCase("September") || month.equalsIgnoreCase("October")
				|| month.equalsIgnoreCase("November")) {
			season = "Fall";

		} else if (month.equalsIgnoreCase("March") || month.equalsIgnoreCase("Apri;")
				|| month.equalsIgnoreCase("May")) {
			season = "Spring";
		} else {
			season = "invalid";
			System.out.println(" Entry is invalid");
		}
		System.out.println("You were born in " + season);
	}

}
