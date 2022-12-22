package oopsProject1;

public class StudentMain {

public static void main(String[] args) {
		

			String[] subjects= {"JAVA","HTML","CSS"};
			
	        //Instantiation of students
			Student s1=new Student("Aman",22,"00000000","101",subjects);
			Student s2=new Student("Rahul",22,"11111111","104",subjects);

	//Printing the students details
			System.out.println(s1);
			System.out.println(s2);

	}
}
