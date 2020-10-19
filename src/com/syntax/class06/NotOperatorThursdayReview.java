package com.syntax.class06;

public class NotOperatorThursdayReview {

	public static void main(String[] args) {
		boolean isRaining = true;

		if (!isRaining) {
			System.out.println("I will go outside");
		} else {
			System.out.println("I'll stay at home");
		}

		int num1 = 10;
		int num2 = 0;
		if (num2 != 0) {
			System.out.println(num1 / num2);
		}
		boolean hasHighIncome = false;
		boolean hasGoodCredit = true;
		boolean hasCriminalRecord = false;
		boolean isElegible = (hasHighIncome || hasGoodCredit) && !hasCriminalRecord;
		{
			System.out.println(isElegible);

		}

	}
}
