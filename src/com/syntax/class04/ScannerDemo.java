package com.syntax.class04;

import java.util.Scanner;

public class ScannerDemo {

	public static void main(String[] args) {

		// shortcut to import for windows Ctrl+shift+o

		int num = 80;// for numbers
		String str = "I am a String";// for text

		Scanner scan = new Scanner(System.in); // enables input to be put into the console
		// I am adding some message to the user
		System.out.println(" Please enter any text");

		String value = scan.nextLine();// this line waits for input, once input is provided- hit Enter button

		System.out.println("I captured value=" + value);

		System.out.println("Please enter your name");
		String name = scan.nextLine();
		System.out.println(" Nice to meet you " + name);
	}

}
