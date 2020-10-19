package com.syntax.class07;

public class Loop4 {

	public static void main(String[] args) {
		/*
		 * Create a boolean variable workDay and assign true create int variable day and
		 * assign to it 1 As long as it is workDay print " I need a day off" and
		 * increase day Once day is 6 print " I do not need a day off any more
		 */
		boolean workday = true;
		int day = 7;
		while (workday) {
			if (day < 6) {
				System.out.println("I need a day off");
			} else {
				System.out.println("It's a weekend and I am off");
			}
			day++;
		}
	}
}
