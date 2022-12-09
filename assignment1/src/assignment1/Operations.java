package assignment1;

import java.util.Scanner;

public class Operations {

	public static void main(String[] args) {
		char operator;
	    int number1, number2, result;

	    // create an object of Scanner class
	    Scanner input = new Scanner(System.in);

	    // ask users to enter operator
	    System.out.println("Choose an operator: +, -, *, /, or %");
	    operator = input.next().charAt(0);

	    // ask users to enter numbers
	    System.out.println("Enter first number");
	    number1 = input.nextInt();

	    System.out.println("Enter second number");
	    number2 = input.nextInt();

	    switch (operator) {

	      // addition betweentwo numbers
	      case '+':
	        result = number1 + number2;
	        System.out.println(number1 + " + " + number2 + " = " + result);
	        break;

	      // subtraction between two numbers
	      case '-':
	        result = number1 - number2;
	        System.out.println(number1 + " - " + number2 + " = " + result);
	        break;

	      // multiplication between two numbers
	      case '*':
	        result = number1 * number2;
	        System.out.println(number1 + " * " + number2 + " = " + result);
	        break;

	      //  division between two numbers
	      case '/':
	        result = number1 / number2;
	        System.out.println(number1 + " / " + number2 + " = " + result);
	        break;
	        
	        //  remainder between two numbers
	      case '%':
	        result = number1 / number2;
	        System.out.println(number1 + " % " + number2 + " = " + result);
	        break;
	        

	      default:
	        System.out.println("Invalid operator!");
	        break;
	    }

	}

}
