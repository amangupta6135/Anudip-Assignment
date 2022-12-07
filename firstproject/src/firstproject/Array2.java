package firstproject;

public class Array2 {
	
		public static void main(String[] args) {
			int[] ar= {1,2,3};
			System.out.println(sumOfArray(ar));
		
			
	}
		
		public static int sumOfArray(int[] ar)  {
			int sum=0;
			
			for(int i=0; i<ar.length;i++) {
				
				sum+=ar[i];
				
			}
			
			return sum;
		}

}
