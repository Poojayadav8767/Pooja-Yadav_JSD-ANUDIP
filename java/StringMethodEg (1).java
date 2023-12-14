package Anudip;

public class StringMethodEg {
	public static void main(String[] args) {
			String name = "Anudip Foundation";
			
			System.out.println(name.toUpperCase());
			System.out.println(name.toLowerCase());
			System.out.println(name); //no changes in original name variable
			System.out.println(name.startsWith("Anu"));
			System.out.println(name.endsWith("nnno")); //ion
			System.out.println(name.charAt(7));
			System.out.println(name.length());
			int num = 567;
			String ss = String.valueOf(num); //converts int to string
			System.out.println(ss + 333);
	}

}
