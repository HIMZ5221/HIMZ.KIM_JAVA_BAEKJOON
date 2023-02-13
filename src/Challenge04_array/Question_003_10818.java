package Challenge04_array;

import java.util.Scanner;

public class Question_003_10818 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int[] N = new int[sc.nextInt()];
		int max = 0;
		int min = 0;
		boolean sw = true;
		
		for(int i=0; i<N.length; i++) {
			N[i] = sc.nextInt();
			if(N[i]>max) {
				max = N[i];
			}
			if(sw == true) {
				min=N[i];
				sw = false;
			}else if(N[i]<min) {
				min = N[i];
			}
				
		}
		System.out.println(min+" "+max);

		
	}

}
