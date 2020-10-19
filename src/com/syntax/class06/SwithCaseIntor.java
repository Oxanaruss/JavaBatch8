package com.syntax.class06;

import java.util.Scanner;

public class SwithCaseIntor {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Please, enter a day number");
		int day = scan.nextInt();

		if (day == 1) {
			System.out.println("Today is Monday, we have no classes");
		} else if (day == 2) {
			System.out.println("Today is Tuesday, we have Manual Testing Class");
		} else if (day == 3) {
			System.out.println("Today is Wednesday and we again have Manual Testing Class");
		} else if (day == 4) {
			System.out.println("Today is Thursday and we have review Class");
		} else if (day == 5) {
			System.out.println("Today is Friday, I have no classes, I'll prepare for tomorrow class");

		} else if (day == 6) {
			System.out.println("I have my Jave class");
		} else if (day == 7) {
			System.out.println("I did a lot of coding today");
		} else {
			System.out.println("This is invalid enty. Please provide  valid day from 1 to 7");
		}
		System.out.println("Same Example Using Switch case");

		String today = null;
		switch (day) {
		case 1:
			today = "Monday";
			break;
		case 2:
			today = "Tuesday";
			break;
		case 3:
			today = "Wednesday";
			break;
		case 4:
			today = "Thursday";
			break;
		case 5:
			today = "Firday";
			System.out.println("Firday");
			break;
		case 6:
			today = "Saturday";
			break;
		case 7:
			today = "Sunday";
			break;
		default:
			today = "Invalid Day";
			break;
		}
		System.out.println("Today is " + today);

	}
}
