package member;

public class Member {

	private String name;
	private int age;
	private String contact;
	private String address;
	private String salary;
	


	 Member(){
		
		name="Aman";
		age=21;
		contact="000000";
		address="Gurgaon";
		salary="25000";
	}
	 

	 Member(String name1,int age1, String contact1, String address1, String salary1 ){
		
		 name=name1;
		 age=age1;
		 contact=contact1;
		 address=address1;
		salary=salary1;
		
	}
	 
	 public void printsalary() {
		 
		 System.out.println("name :"+name);
		 System.out.println("age :"+age);
		 System.out.println("contact :"+contact);
		 System.out.println("address :"+address);
		 System.out.println("salary :"+salary);
		
	 }
}
