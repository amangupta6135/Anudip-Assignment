package useSynchronization;

public class FiboRev {
	
	synchronized public void fibo() 
	{
		int n = 10; 
		int firstTerm = 0; 
		int secondTerm = 1;
	
		for (int i = 1; i <= n; ++i) 
    	{
    		System.out.println(firstTerm);      
      		int nextTerm = firstTerm + secondTerm;
      		firstTerm = secondTerm;
      		secondTerm = nextTerm;
    	}
	}

	synchronized public void rev() 
	{
		for (int i = 10; i >= 1; i--) 
    	{
    		System.out.println(i);      
    	}
	}

}
