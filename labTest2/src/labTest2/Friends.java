package labTest2;

public class Friends extends Thread {
	
	public void run() {
		
//	Array created for 10 elements
//		String a[]=new String [10];
//		a[0]="Aman";
//		a[1]="Rahul";
//		a[2]="Amit";
//		a[3]="Abhishek";
//		a[4]="Bhavya";
//		a[5]="Bharat";
//		a[6]="Prince";
//		a[7]="Ram";
//		a[8]="Rohit";
//		a[9]="Manish";
		
		
//		Array created for 10 elements
		String a[]= {"Aman","Rahul","Amit","Abhishek","Bhavya","Bharat","Prince","Ram","Rohit","Manish"};
		
// use for each loop		
		for(String b : a) {
			System.out.println(b+" ");
		}
	}

}
