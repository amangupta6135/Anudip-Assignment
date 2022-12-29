package labTest;

import java.util.Scanner;
import java.util.regex.Pattern;

public class Check {

	public static void main(String[] args) {
		

		Scanner sc = new Scanner(System.in);
	    System.out.print("Enter email id: ");
	    
	    String emailId = sc.nextLine();   

	    try { 
	    	
	      if (!emailId.contains(".") || !emailId.contains("@") || !emailId.substring(emailId.indexOf("@")).contains("."))
	      {
	        throw new InvalidMailIdException("Invalid email id"); 
	      }
	      System.out.println("Invalid Email !"); 
	     } 
	    catch (InvalidMailIdException e) 
	    {
	      System.out.println(e); 
	    }
	  
	    finally
	  		{
	  			sc.close(); // closes the Scanner class
	  		}

	}

}
