package Anudip;

public class ExceptionEg {
	public static void main(String[] args) {
		try {
		String name =null;
		System.out.println(name);
			
		int arr[] = {1,2,3,4,5,7,8,9,23,67};
		System.out.println(arr[1] + " ");
		
		System.out.println(name.length());
		}catch(Exception e) {
			System.out.println(e);
		}
		
		finally {
			System.out.println("We are learning java runtime exception ");
		}
		
	}

}
