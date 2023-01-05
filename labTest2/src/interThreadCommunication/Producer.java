package interThreadCommunication;

public class Producer {

int availableProducts;
	
	
	Producer(int availableProducts)
	{
		this.availableProducts=availableProducts;
	}
	
	
	synchronized public void demand(int n)
	{
		System.out.println("Available Product :"+availableProducts);
		
		
		if (n>availableProducts)
		{
			try {
				  wait();
				}catch(InterruptedException ie)
			     {
					ie.printStackTrace();
					
			     }
			}
			
		availableProducts-=n;
		System.out.println("Available Products after demant fulfillment :"+availableProducts);
			
	}
	
	
	
	synchronized public void supply(int n)
	{
		System.out.println("Available Products before receiving supply :"+availableProducts);
		
		
		availableProducts+=n;
		
		System.out.println("Available Products after receiving supply :"+availableProducts);
		notify();
	}
	
}
