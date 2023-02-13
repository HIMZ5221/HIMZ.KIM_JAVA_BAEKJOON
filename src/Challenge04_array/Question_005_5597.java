package Challenge04_array;

import java.util.Scanner;

public class Question_005_5597 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		boolean[] ary = new boolean[31];
		
		for(int i=0; i<=27; i++) {
			ary[sc.nextInt()] = true;
		}
		
		for(int i=1; i<=30; i++) {
			if(ary[i]!=true) {
				System.out.println(i);
			}
		}
		
	}

}
