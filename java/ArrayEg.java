package Anudip;

public class ArrayEg {
	
	static void show(String namess[]) {
//		for(int i=0;i<namess.length;i++) {
//		System.out.println(namess[i]);
//	}
	for(String a : namess) {
		System.out.println(a);
	}	
	}
	
	public static void main(String[] args) {
		//	int[] scoree; //declare
		//	int score1[];
			int score2[] = new int[5]; //declare & instantiation
			score2[0] =45; //initialization
			score2[1] =85;
			score2[2] =35;
			score2[3] =55;
			score2[4] =59;
			
			int score[] = {56,39,67,88,39,59,65,88,47,54,88,55,78,69}; //declare, instantiation, initialization
			
			//printing
			for(int i=0;i<score.length;i++) {
				System.out.println(score[i]);
			}
			
			String namess[] = {"abc","ed","ghj","mop"};
			ArrayEg.show(namess);
	}

}
