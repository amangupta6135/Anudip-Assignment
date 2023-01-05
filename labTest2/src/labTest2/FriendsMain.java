package labTest2;

public class FriendsMain {

	public static void main(String[] args) {
		
		 // Thread created for write operation
		Friends th1=new Friends();
		Friends th2=new Friends();
		Friends th3=new Friends();
		
		th1.start();
		th2.start();
		th3.start();

	}

}
