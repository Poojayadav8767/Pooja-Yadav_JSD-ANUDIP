package Anudip;

public class ArrayPracEg {
	public static void main(String[] args) {
		//remove duplicate elements
		int score[] = {56,39,67,88,39,59,65,88,47,54,59,55,78,69}; 
		for(int i=0;i<score.length;i++) {
			for(int j=i+1;j<score.length;j++) {
				if(score[i] == score[j] ){ //39 == 39
					System.out.println(score[j]);
				}
			}
		}
		//reverse an array
		for(int i=(score.length)-1; i>=0;i--) {
			System.out.println(score[i]);
		}
		
		
		//print evenodd number
		int numbers[] = {2,6,3,8,3,9,4,5};
		for(int i=0;i<numbers.length;i++) {
			if(numbers[i]%2!=0) {
				System.out.println(numbers[i]); //odd
		}
		
		}		
			for(int i=0;i<numbers.length;i++) {
				if(numbers[i]%2==0) {
			System.out.println(numbers[i]); //even
				}}
			}
		}
		
		
	