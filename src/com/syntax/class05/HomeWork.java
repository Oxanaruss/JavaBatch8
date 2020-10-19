package com.syntax.class05;

import java.util.Scanner;

public class HomeWork {

	public static void main(String[] args) {
		/*
		 * ask user if he has a credit card if not offer one if they do have a card,
		 * what is balance on card if balance more than 1000 tell them to pay off
		 * immediately, otherwise they cannot spend more
		 */
//
		int a = 10;
		int b = 90;
		Scanner scan;
		String answer;
		double balance;

		scan = new Scanner(System.in);
		System.out.println("Please enter if you have a credit card (true/false)");

		answer = scan.next();

		if (answer.equalsIgnoreCase("yes")) { // use string instead of boolean if answer is yes or now
			System.out.println("What is the balance on the card?");
			balance = scan.nextDouble();
			if (balance > 1000) {
				System.out.println("Please, pay your card balance");
			} else {
				System.out.println("You can spend more");
			}
		} else {
			System.out.println("Woudl you like to get a credit card?");
		}
	}

}
