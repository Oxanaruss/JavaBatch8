package com.syntax.class05;

import java.util.Scanner;

public class HWSwitchGrades {

	public static void main(String[] args) {
		/*
		 * Allow user to enter grade and then provide explanation: A-Excellent, B-Good,
		 * C-Average, D-Bad, any other grade --> Not Acceptable. At the end your program
		 * should print which grade was entered by a user with explanation.
		 * 
		 */

		System.out.println("Please, enter your grade");
		Scanner input = new Scanner(System.in);
		char grade = input.next().charAt(0);
		String message = null;
		switch (grade) {
		case 'A':
			message = "Excellent";
			break;
		case 'B':
			message = "Good";
			break;
		case 'C':
			message = "Average";
			break;
		case 'D':
			message = "Bad";
			break;
		default:
			message = " Not Acceptable";
			break;

		}
		System.out.println("Your grade " + grade + " which is " + message);
		
		
		import java.util.Scanner;
		class Main {
		  public static void main(String[] args) {
		  
		    Scanner scan;
				int mark;
				char grade = 0;

				scan = new Scanner(System.in);
				System.out.println("Please enter your mark");
				mark = scan.nextInt();
				if (mark > 0 && mark < 25) {
					grade = 'F';
				} else if (mark >= 25 && mark < 45) {
					grade = 'E';
				} else if (mark >= 45 && mark < 50) {
					grade = 'D';
				} else if (mark >= 50 && mark < 60) {
					grade = 'C';
				} else if (mark >= 60 && mark < 80) {
					grade = 'B';
				} else if (mark >= 80 && mark <= 100) {
					grade = 'A';
				} else {
					System.out.println("Please enter valid mark");
				}
				if (grade!=0){
				  System.out.println("Your grade is "+grade);
				}
				
				
				import java.util.Scanner; 
				class Main {
				  public static void main(String[] args) {
				    Scanner sc = new Scanner (System.in);
				    System.out.println("Enter name of the instructor"); 
				    String name = sc.nextLine(); 
				    String subject=null;
				    
				    switch(name){
				      case "Asghar":
				        subject="Java";
				        break;
				      case "Moazam":
				        subject="SDLC";
				        break;
				      case "Weqas":
				        subject="Selenium";
				        break;
				      case "Asel":
				        subject="every";
				        break;
				      
				      default:
				        System.out.println("Invalid instructor selected");
				      
				      } 
				      
				      if(subject!=null){
				         System.out.println("Will take care of "+subject+" Assignment");
				      }
				  }
				}
				import java.util.Scanner; 
				class Main {
				  public static void main(String[] args) {
				    Scanner sc = new Scanner (System.in);
				    System.out.println("Enter name of the instructor"); 
				    String name = sc.nextLine(); 
				    String subject=null;
				    
				    switch(name){
				      case "Asghar":
				        subject="Java";
				        break;
				      case "Moazam":
				        subject="SDLC";
				        break;
				      case "Weqas":
				        subject="Selenium";
				        break;
				      case "Asel":
				        subject="every";
				        break;
				      
				      default:
				        System.out.println("Invalid instructor selected");
				      
				      } 
				      
				      if(subject!=null){
				         System.out.println("Will take care of "+subject+" Assignment");
				      }
				  }
				}
				    
		  }
		  
		}
	}

}
