package Challenge04_array;

import java.util.Scanner;

public class Question_007_1546 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int N = sc.nextInt();
		double[] ary = new double[N];
		double M = 0;
		double sum = 0;
		
		for(int i=0; i<ary.length; i++) {
			ary[i] = sc.nextInt();
			if(ary[i]>M) {
				M = ary[i];
			}
		}

		for(int i=0; i<ary.length; i++) {
			sum += (ary[i]/M)*100;
		}
		
		System.out.println(sum/N);
		

	}

}
