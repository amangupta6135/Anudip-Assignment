package matrix;

public class Matrix {

	public static void main(String[] args) {
		//creating two matrix    
		int a[][]={{10,20,30},{40,50,60},{70,80,90}};    
		int b[][]={{1,2,3},{4,5,6},{7,8,9}};    
		    
		//creating another matrix to store the sum of two matrix
		
		int c[][]=new int[3][3];  //3 rows and 3 columns  
		    
		//adding and printing addition of 2 matrix  
		
		for(int i=0;i<3;i++)
		{ 
			
			for(int j=0;j<3;j++)
			{
				
				c[i][j]=a[i][j]+b[i][j];   //add the a and b matrix
				System.out.print(c[i][j]+" ");    
			}    
		System.out.println();//new line    
		} 
		
		

	}

}
