package mamta;

public class Student1 {
	public static void main(String[] args) {
		ProtectedEg p = new ProtectedEg();
		p.subject1 = 67;
		p.subject2 = 55;
		p.subject3 = 88;
		p.grade = "B"; 
		
		System.out.println(p.subject1 + " " + p.subject2 + "  "+ p.subject3 + " " + p.grade);

	}

}
