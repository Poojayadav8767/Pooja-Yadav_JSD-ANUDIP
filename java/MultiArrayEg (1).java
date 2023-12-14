package Anudip;

public class MultiArrayEg {
	public static void main(String[] args) {
		//declare & initializing 2D
	int numbers[][] = {{6,78,9},{2,34,67},{6,23,11}}; //3*3
	
	//printing
	for(int i=0;i<numbers.length;i++) {
		for(int j=0;j<3;j++) {
			System.out.print(numbers[i][j] + "  ");
		}
		System.out.println();
	}
	
	System.out.println("----------------------");
	//matrices add
	// two matrices for calculation
	int arr1[][] = {{1,2,3},{4,5,6},{7,8,9}};
	int arr2[][] = {{11,22,33},{44,55,62},{77,81,19}};
	int[][] res = new int [3][3]; //resultant matrix
	
	//add & print
	for(int i=0;i<3;i++) {
		for(int j=0;j<3;j++) {
			res[i][j] = arr1[i][j] + arr2[i][j];
		//	res[i][j] = arr1[i][j] - arr2[i][j];
			System.out.print(res[i][j] + "   ");
		}
		System.out.println();
		}
		
	
	}
}
