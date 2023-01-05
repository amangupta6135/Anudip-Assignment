package useSynchronization;

public class Main {

	public static void main(String[] args) {
		FiboRev fr= new FiboRev();
		
		Thread th1 = new FiboThread(fr);
		Thread th2 = new RevThread(fr);
		
		th1.start();
		th2.start();

	}

}
