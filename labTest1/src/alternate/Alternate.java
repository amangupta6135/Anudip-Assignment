package alternate;

public class Alternate {

	public static void main(String[] args) {
		 int[] arr ={10,20,30,40,50,60,70,80,90,100};
		 
	       //array length
	       int n = arr.length;
	       	
	        int sum=0;
	       
	        // loop through the array and increment by 2
	       for(int i=0; i<n; i=i+2)
	       {
	         //print element
	         System.out.println(arr[i]);
	         
	         sum=sum+arr[i];// add a alternate number
	       }
	       //print a value of add a alternate number
	       System.out.println("Add a Alternate number :"+sum);
	       
	    
	    
	}

}
