package com.syntax.class03;

public class IfElseBlock {

	public static void main(String[] args) {

   double money=2;
   double iceCream=5.59;
   if(money>=iceCream) {
	System.out.println("Iam buying icecream");
	System.out.println("I'd like vanilla flavor");
}
else {
	System.out.println( "Sorry, no icecream");
	System.out.println("Less sugar is better for you");
	
}
System.out.println("I am a code that executes without any conditions");



// if not sleepy - I will study otherwise I will take a nap

   boolean sleepy=false;

   if(sleepy) {
	System.out.println("I'll take a nap");
}  else {
	System.out.println( "I will study som Java");
	
	boolean hungry=false; // or could put true
	if (hungry) {
		System.out.println("I'll eat");
	} else {
		System.out.println("I'll contuinue studying");
		
		
		
	}
}
	}

}
