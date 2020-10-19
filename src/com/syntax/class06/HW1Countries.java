package com.syntax.class06;

import java.util.Scanner;

public class HW1Countries {

	public static void main(String[] args) {
		/*
		 * Ask user to enter their country and capture it. Once values are captured
		 * print which language user speaks.
		 */

		System.out.println("Enter country you were born in");
		Scanner scan = new Scanner(System.in);
		String country = scan.nextLine();
		String language = null;

		switch (country) {
		case "England":
			language = "English ";
			break;
		case "Germany":
			language = "German";
			break;
		case "Russia":
			language = "Russian ";
			break;
		case "Ukraine":
			language = "Ukrainian";
			break;
		case "Spain":
			language = "Spanish";
			break;

		default:
			language = "unknown language";
			break;
		}
		System.out.println("You speak " + language);
	}

}
