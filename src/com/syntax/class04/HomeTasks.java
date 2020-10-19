package com.syntax.class04;

import java.util.Scanner;

public class HomeTasks {

	public static void main(String[] args) {

		/*
		 * You are a loan specialist and you need to ask user what is the amount of loan
		 * is needed. If loan is less or equal to 200,000 then you would lend the money
		 * otherwise you would reject the client.
		 */

		Scanner input = new Scanner(System.in);
		System.out.println("Please, enter the loan amount you would like to take.");
		int loan = input.nextInt();
		if (loan <= 200000) {
			System.out.println("Congratulations! We approved your loan!");
		} else {
			System.out.println("We are sorry, your request has been denied.");
		}

		/*
		 * You are DMV representative and you need to ask customer their age. If they
		 * are 18 and older you will issue a driver license to them, otherwise you will
		 * offer them to get a learners permit.
		 * 
		 */

		System.out.println(" Please, enter your age");
		int age = input.nextInt();
		if (age >= 18) {
			System.out.println("We will issue you driver's license");
		} else {
			System.out.println("Based on your age we can issue you learner's permit");
		}

		/*
		 * Create a Java program that will ask user to input city and temperature. Your
		 * program should convert Fahrenheit into Celsius and print “The temperature is
		 * the city __ is __”
		 */

		System.out.println(" Please, enter the name of your city");
		String city = input.next();
		System.out.println("Please, enter the temperature in your city in Faherheit");
		int temp = input.nextInt();

		System.out.println("The temperature in " + city + " is " + (temp - 30) / 2 + " C.");
		;
	}
}
