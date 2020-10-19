package com.syntax.class07;

import java.util.Scanner;

public class LoopDoWhile {

	public static void main(String[] args) {
		// Lottery
		Scanner scan;
		int numberFromUser;
		int luckyNumber = 7;

		scan = new Scanner(System.in);
		do {
			System.out.println("Please, enter any number from 1-100");
			numberFromUser = scan.nextInt();

		} while (numberFromUser != luckyNumber);
		System.out.println("Your guessed the right number");
	}

}
