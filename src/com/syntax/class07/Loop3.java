package com.syntax.class07;

public class Loop3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String day = "Saturday";
		if (day.equals("Saturday")) {
			System.out.println("My favourite Java class");
			{
				while (day.equals("Saturday")) {
					System.out.println("My favourite Java class");
					day = "Sunday";
				}

			}
			boolean isItBreakTime = true;
			if (isItBreakTime) {
				System.out.println("I'll have tea");
			}
			while (isItBreakTime) {

				System.out.println("I'll have tea");
			}
		}
	}
}