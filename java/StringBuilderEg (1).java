package Anudip;

public class StringBuilderEg {
	public static void main(String[] args) {
	StringBuilder ss = new StringBuilder(" Java Full Stack ");
	
	ss.append("Courses "); //changes in ss
	System.out.println(ss);
	
//	ss.insert(0, "Advance Program "); 
	ss.insert(16, " Angular"); //adding angular at 16 position
	System.out.println(ss);
	
	ss.replace(25, 32, "Coursesss"); //replace word from 25 position 
	System.out.println(ss);
	
	ss.delete(32, 35); //remove character from 32 position
	System.out.println(ss);
	
	StringBuffer s1 = new StringBuffer("Hellooo");
	s1.reverse(); //reverse current string
	System.out.println(s1);
	}

}
