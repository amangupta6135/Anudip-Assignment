package duplicate;

import java.util.Scanner;

public class Duplicate {

	public static void main(String[] args) {
		
		String s;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter String Data: ");
		
		s=sc.nextLine();
	
		char[] c = s.toCharArray();
		int sz= c.length;
		
		int count=0;
		for (int i=0; i<sz; i++) {
			count=0;
			
			for(int j=0; j<sz; ++j) {
				if(j<i && c[i] ==c[j]) {
					break;
				}
				
				if(c[j] == c[i]) {
					count++;
				}
				
				if(j ==sz-1) {
					System.out.println("the character "+c[i]+" is present "+count+" times");
				}
			}// end of j loop
			
		} // end of i loop
		
		
	}

}
