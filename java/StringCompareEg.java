package Anudip;

public class StringCompareEg {
	public static void main(String[] args) {
		String n1 = "Java Full Stack";
		String n2 = "Jaava";
		String n3 = new String("Java Full Stack");
		
		System.out.println(n1.equals(n2)); //false
		System.out.println(n1.equalsIgnoreCase(n3)); //true
		System.out.println(n1.equals(n3)); //false
		System.out.println(n1 == n3); //false n3 refers to instance outside string pool
		
		
		String n4 = "maam";
		String n5 = "noon";
		String n6 = "Jaava";
		
		System.out.println(n5.compareTo(n4)); //positive number
		System.out.println(n6.compareTo(n2)); //equal 0
	}

}
