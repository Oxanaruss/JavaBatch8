package com.syntax.class07;

public class Loop2 {

	public static void main(String[] args) {
		// print numbers from 1 to 100 only odd numbers
		int i = 1;
		while (i < 101) {
			if (i % 2 == 0) {

				System.out.println(i + " ");

			}
		}
	}
}