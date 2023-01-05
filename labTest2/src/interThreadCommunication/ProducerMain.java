package interThreadCommunication;

public class ProducerMain {

	public static void main(String[] args) {
	
		
		Producer p = new Producer(1000);
		
		DemandThread dt = new DemandThread(p);
		SupplyThread st = new SupplyThread(p);
		
		// Starting both Thread
		dt.start();
		st.start();


	}

}
