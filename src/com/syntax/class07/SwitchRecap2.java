package com.syntax.class07;

public class SwitchRecap2 {

	public static void main(String[] args) {
		// if months December-February---> winter
		// f months June-August ---> summer, etc.

		String month = "May";
		String season = null;

		switch (month) {
		case "January":
		case "February":
		case "December":
			season = "winter";
			break;
		case "April":
		case "March":
		case "May":
			season = "spring";
			break;
		case "June":
		case "July":
		case "Augus":
			season = "summer";
			break;
		}
		if (season != null) {
			System.out.println(season);
		}

	}

}
