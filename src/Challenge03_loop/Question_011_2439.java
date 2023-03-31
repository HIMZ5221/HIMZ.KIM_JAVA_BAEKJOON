package Challenge03_loop;

import java.util.Scanner;

public class Question_011_2439 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int N = sc.nextInt();
	
		for(int j=0; j<N; j++) {
		
			for(int i=N-1; i>j; i--) {
				System.out.print(" ");
			}
			for(int s=0; s<=j; s++) {
				System.out.print("*");
			}
			System.out.println();
		}	
	}

}
