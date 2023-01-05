package useSynchronization;

public class FiboThread extends Thread {

	FiboRev f;
    
	public FiboThread(FiboRev f) 
	{
		this.f=f;
	}
	
	@Override
	public void run() {
		f.fibo();
	}
}
