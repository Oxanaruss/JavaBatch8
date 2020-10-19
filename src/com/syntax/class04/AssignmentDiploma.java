package com.syntax.class04;

public class AssignmentDiploma {

	public static void main(String[] args) {

		boolean diploma = true;
		double gpa = 2.5;

		if (diploma) {
			System.out.println("Congartulations!");
			if (gpa >= 3.5) {
				System.out.println("You are eligible for scholarship");
			} else {
				System.out.println("You should have studied harder");
			}

		} else {
			System.out.println("Get a degree!");
		}
	}

}
