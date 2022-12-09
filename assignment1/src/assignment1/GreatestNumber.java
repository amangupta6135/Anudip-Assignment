package assignment1;

public class GreatestNumber {

	public static void main(String[] args) {
	
		
		GreatestNumber gn = new GreatestNumber();
		gn.Greatest();

	}
	

	    public void Greatest(){

	        int n1 = -6, n2 = 3, n3 = 7;

	        if( n1 >= n2 && n1 >= n3)
	            System.out.println(n1 + " is the Greatest number.");

	        else if (n2 >= n1 && n2 >= n3)
	            System.out.println(n2 + " is the Greatest number.");

	        else
	            System.out.println(n3 + " is the Greatest number.");
	    }
}


