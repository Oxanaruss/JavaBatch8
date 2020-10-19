package com.syntax.class06;

public class NotOperator3 {

	public static void main(String[] args) {
		boolean isJavaEasy = true;
		if (!isJavaEasy) {
			System.out.println("Spend more time practicing Java");
		}

		System.out.println("---------------------------");

		String day = "Saturday";
		if (!day.equals("Sunday") && day.equals("Saturday")) {

			System.out.println("I'm not going to work");
		}
	}

}
