package com.syntax.class05;

import java.util.Scanner;

public class LogicalPeratorsClassTask3Improved {

	public static void main(String[] args) {
		Scanner scan;
		int quiz, mid, finalScore, avg;
		scan = new Scanner(System.in);

		System.out.println("Please enter quiz score");
		quiz = scan.nextInt();

		System.out.println("Please enter mid term score");
		mid = scan.nextInt();

		System.out.println("Please enter final score");
		finalScore = scan.nextInt();

		avg = (quiz + mid + finalScore) / 3;
		System.out.println(avg);
		char grade;

		if (avg >= 90) {
			grade = 'A';
		} else if (avg >= 70 && avg < 90) {
			grade = 'B';
		} else if (avg >= 50 && avg < 70) {
			grade = 'C';
		} else {
			grade = 'F';
		}
		System.out.println("Grade is = " + grade);
		if (grade == 'A' || grade == 'B') {
			System.out.println(" You are a good student and you are studying a lot");
		} else {
			System.out.println(" Please study more");
		}
	}

}
