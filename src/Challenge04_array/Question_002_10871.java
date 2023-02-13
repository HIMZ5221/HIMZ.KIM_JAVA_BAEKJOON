package Challenge04_array;

import java.util.Scanner;

public class Question_002_10871 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int[] N = new int[sc.nextInt()];
		int X = sc.nextInt();
		
		for(int i=0;i<N.length;i++) {
			N[i] = sc.nextInt();
		}
		for(int i=0; i<N.length; i++) {
			if(N[i] < X) {
				System.out.print(N[i]+" ");
			}
		}
				
		

	}

}
