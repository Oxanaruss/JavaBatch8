package com.syntax.class04;

public class IfElaseIf {

	public static void main(String[] args) {

		int num1 = 99;
		int num2 = 99;

		if (num1 > num2) { // what if this condition is true
			System.out.println(num1 + " is bigger than " + num2);

		} else if (num1 < num2) { // or what if this condition is true
			System.out.println(num1 + " is smaller than " + num2);

		} else {
			System.out.println(num1 + " is equal to " + num2);
		}

		/*
		 * Based on the day of the week we will print class schedule
		 */
		int day = -99;
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

	}

}
