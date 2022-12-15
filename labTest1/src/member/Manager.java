package member;

public class Manager extends Member {
	
	String specialization;

	 Manager(){
			
		     specialization = "Java";
			
		}
		 

		 Manager(String specialization){
		 
			this.specialization=specialization;
		
			
		}
		 
			public void printsalary()
			{
				
				System.out.println("Person Department is = "+specialization);
				
				System.out.println("..................................");
				 
			}


}
