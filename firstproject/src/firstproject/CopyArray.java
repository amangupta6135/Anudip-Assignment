package firstproject;


public class CopyArray {

	public static void main(String[] args) {
		 int [] arr1 = {1, 2, 3, 4, 5, 6};
	        print(arr1);  
   
	}
	
	public static void print(int[] arr1) {
		int[] arr2 = new int[6];
		for(int i=0; i<6;i++)
		{
			arr2[i] = arr1[i];
			System.out.println(arr2[i]);
		}
	}

}
