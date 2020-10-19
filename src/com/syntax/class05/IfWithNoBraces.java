package com.syntax.class05;

public class IfWithNoBraces {

	public static void main(String[] args) {
		boolean isSaturday = false;

		if (isSaturday)
			System.out.println("Today is Java class");// if not curly braces only one line bill be treated as code block
		else
			System.out.println("Today is not Saturday");
		System.out.println("And tomorrow is Java Class as well");

		System.out.println("I'm a code outside of if Statement");

	}

}
