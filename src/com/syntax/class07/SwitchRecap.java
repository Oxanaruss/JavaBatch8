package com.syntax.class07;

public class SwitchRecap {

	public static void main(String[] args) {

		String timeOfDay = "morning";
		String Day = "Monday";

		switch (timeOfDay) {
		case "morning":
			System.out.print("Good Morning");
			switch (Day) {
			case "Monday":
				System.out.println(" Colleagues");
				break;
			case "Saturday":
				System.out.println("Class");
				break;
			}
			break;
		case "afternoon":
			System.out.println("Good Afternoon");
			break;
		case "evening":
			System.out.println("Good Evening");
			break;
		case "night":
			System.out.println("Good Night");
			break;

		}

	}

}
