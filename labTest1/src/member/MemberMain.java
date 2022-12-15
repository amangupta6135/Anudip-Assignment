package member;

public class MemberMain {

	public static void main(String[] args) {
		
		Member m1 = new Member();
		
		Employee e1 = new Employee();
		
		Manager mr1 = new Manager();
		
		m1.printsalary();
		e1.printsalary();
		mr1.printsalary();
	}

}
