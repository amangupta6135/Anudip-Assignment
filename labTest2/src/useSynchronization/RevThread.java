package useSynchronization;

public class RevThread extends Thread{
	FiboRev r;
    
	public RevThread(FiboRev r) 
	{
		this.r=r;
	}
	
	@Override
	public void run() {
		r.rev();
	}

}
