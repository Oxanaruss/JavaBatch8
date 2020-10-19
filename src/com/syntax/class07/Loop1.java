package com.syntax.class07;

public class Loop1 {

	public static void main(String[] args) {
		int time = 15;
		if (time > 12) { // condition true
			System.out.println("Good day");
		}

		/*
		 * while (time > 12) { System.out.println("Good day");// infinite loop
		 */
		while (time > 12) {
			System.out.println("Good day");// how many times: 3 times
			time--;
			/*
			 * int = 15 , time -- means minus 1 and the loop will run 14 times if int =5 and
			 * condition in while = >12, it won't print at all
			 */

		}
		while (time > 12) {
			System.out.println("Good day");// 1
			time++;// if int=15 than loop will run 16 times
		}

		// I want to print numbers from 1-50

		System.out.println("---------Printing numbers from 1-50 ---------");

		int num = 0;// to start printing from 1 put initial 1 not 0
		while (num < 50) {// loop will stop at 49 not 50, change 50 for 51 if want 50 to be printed
			// or put (num<=50)
			System.out.println(num);// your start from "0" and then system will print doing +1
			num++;// 0,1,2-
		}

		// I want to print from 10 to 60
		int a = 10;
		while (a < 61) {// or while (a<=60)
			a++;
		}

		// i want to print from 100 to 60
		int b = 100;
		while (b >= 60) {
			System.out.print(b + " ");
			b--;

		}

		// I want to print numbers from 10 to 30 only even numbers
		int c = 10;
		while (c < 31) {
			if (c % 2 == 0) {
				System.out.print(c + " ");
			}
			c++;

		}
		// another way
		int d = 10;
		while (c <= 30) {
			System.out.print(d + " ");
			d += 2;

		}
		// another way
		int i = 10;
		while (i < 31) {// since i= 10 condition is correct
			if (i % 2 == 0) {//

			}

			System.out.print(d + " ");
			i++;// adds 1 to i
		}
	}
}
