package com.syntax.class02;

public class VariableDeclaration {

	public static void main(String[] args) {
		// one way to create a variable
		// create variable= assigning value
		// declare a variable= initializing 
		
    double $num=12.99;
    
       //2 way to create a variable
      // declare a value
      // initialize or assign value
    
    int MyBox;
    MyBox=135;
 // we declare variable only once in the program. Don't create that variable/box again
    
  // if you put type of variable again (int) Java thinks you create variable again, just use MyBox=135 not int MyBox=135
		  // Java message -duplicate of variable
		  
		  MyBox=135;// assigning value
		  System.out.println(MyBox);// output 135
		  
          MyBox=155; // You can change variable, output will be 155 , reassigning value
          System.out.println(MyBox);//output 155
          
          // 3 way of declaration
          // if variables of the same type we can declare all in one line
          
          int num1,num2, num3;
          num1=10;
          num2=20;
          num3=30;
          System.out.println(num3);
          
          char char1='c';
          char char2='d';
          char char3=char1;
          System.out.println(char3);// output will be:c You can use value of another variable
          
          // in this case operation happens form the right to the left: assignment of value happens first- value 'C'
        		
          byte MyBox1;
          short MyBox2;
          int MyBox3;
          long MyBox4;
          
          float MyBox5;
          double MyBox6;
          
          char MyBox7;
          boolean MyBox8; 
          
          MyBox1=10;
          MyBox1=15;
          MyBox2=200;
          MyBox3=20000;
          MyBox4=4000000000L;
          
          MyBox5=9.99f;
          MyBox5=11.99f;
          
          MyBox6=10.99;
          
          MyBox7='^';
          
          MyBox8=true;
          MyBox8=false;
          
          
          System.out.println(MyBox1); // 10 and then 15
          System.out.println(MyBox5);// 9.99 and then 11.99
          System.out.print(MyBox8);//true and then update by false
          
          
        		 
          
          
          
          
          
          
	}

}
