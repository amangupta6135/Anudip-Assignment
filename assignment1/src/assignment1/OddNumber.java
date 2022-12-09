package assignment1;

public class OddNumber {

	public static void main(String[] args) {
		
		OddNumber on =new OddNumber();
		
		//method calling 
		on.displayOddNumbers();
		
	}
		
		public void displayOddNumbers() {
			
			int number=20;  
			System.out.print("List of odd numbers from 1 to"+number+": "); 
			
			for (int i=1; i<=number; i++)   
				{  
			
			//if i%2 is not equal to zero, the number is odd  
					if (i%2!=0)   
				{  
						
			//prints the odd numbers 
			System.out.print(i + " ");  
				} 
					
				}  
			
		}

	

}
