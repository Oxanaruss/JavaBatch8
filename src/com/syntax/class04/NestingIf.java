package com.syntax.class04;

public class NestingIf {

	public static void main(String[] args) {
		/*
		 * variable for allergy -yes or no if allergy is yes - if allergy is "yes" we'll
		 * check further if there is allergy to pets...or peanuts
		 */
		boolean allergy = true;

		boolean petAllergy = false;

		if (allergy) { // only if "outer if" is true then we will go deeper into "inside if"
			System.out.println("Let's go further and chech");
			if (petAllergy) {
				System.out.println("No pets please");
			} else {
				System.out.println("That's good that you don't have pet allergy");
			}

		} else {
			System.out.println(" You are lucky");
		}
	}

}
