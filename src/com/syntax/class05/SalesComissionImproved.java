package com.syntax.class05;

import java.util.Scanner;

public class SalesComissionImproved {

	public static void main(String[] args) {

		Scanner scanner;
		double comission = 0;
		scanner = new Scanner(System.in);
		System.out.println("Please, enter sales amount");
		int sales = scanner.nextInt();
		if (sales >= 10 && sales < 100) {
			comission = sales * 0.1;
		} else if (sales >= 100 && sales < 200) {
			comission = sales * 0.2;
		} else if (sales >= 200 && sales < 500) {
			comission = sales * 0.3;
		} else if (sales >= 500) {
			comission = sales * 0.5;
		} else {
			System.out.println("no comission");
		}
		System.out.println("Your comission " + comission);
	}

}
