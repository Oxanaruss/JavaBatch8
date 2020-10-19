package com.syntax.class02;

public class StringConcatenation {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// how to print name and last name together
		
		String name="Olga";
		
		//I would like to say: My name is Olga
		System.out.println("My name is" +name);
		String lastname="Sorrels";
		
		// I'd lke to print full name
		System.out.println(name+" "+lastname);
		
		//Let's say: Olga lives in Miami
		String City="Miami";
		System.out.println(name+" lives in "+City);
		
		// let's say: Olga is B student
		char grade='B';
		System.out.println(name+" is "+grade+" student.");
		
		// Let's say: Olga is 21 years old
		int age=21;
		System.out.println(name+" is "+age+" years old.");
		/*
		 *   to attach/ concatenate Any value {string, char, int, double..ect} 
		 *   to a string we use '+' sign
		 *   We call string concatenation operator
		 */
		                                                 
		
		// code execution is from top to bottom and left to right
		
		// Let's say:27 September
		int date=27;
		String month="September";
		System.out.println(date+" "+month);
		
		String state="DC";
		String anotherstate=" DC";
		// Above strings are not equal: state - 2 characters D+C; another state has 3 chars: space+ D+C
		
		System.out.println(state);
		System.out.println(anotherstate);
		
			
		
	}

}
