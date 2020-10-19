package com.syntax.class03;

public class TasksForIfElse {

	public static void main(String[] args) {
		/*
		 * Create a Java program and name it Double Comparison. Declare 2 double values
		 * and if value of first variable is higher then the second, print “Double value
		 * __ is larger than __ .” Otherwise print...
		 * 
		 * 
		 * 
		 * 
		 */

		double money = 100;
		double price = 200;
		if (money >= price) {
			System.out.println("I can buy it");

		} else {
			System.out.println("I cannot buy it");

			System.out.println("It's way too expensive! Cannot afford it");

		}
		int temp = 35;

		if (temp <= 32) {
			System.out.println("Water will freeze with temperature " + 32);
		}

		else {
			System.out.println("Water will NOT freeze with temperature " + temp);
		}

		int score = 80;
		boolean assignment = true;
		if (assignment) {

			if (score > 90) {
				System.out.println("Great Job!");
			} else if (score > 80) {
				System.out.println("Good Job!");
			} else if (score > 70) {
				System.out.println("Please, study more!");
			} else {
				System.out.println("Thank you for trying");
			}
		} else {
			System.out.println("You should always complete your assignments");
		}

	}

}
