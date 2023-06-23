package Challenge02;

import java.util.Scanner;

public class Question_006_2525 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		int A = sc.nextInt();
		int B = sc.nextInt();
		int C = sc.nextInt();
		
		int sum = B+C;
		
		if((sum)>=60) {
			while((sum)>=60) {
				A++;
				sum = (sum)-60;
					if(A>23) {
						A=0;
					}
			}
			System.out.println(A+" "+sum);
			
		}else {
			System.out.println(A+" "+(sum));
		}
	}
}
