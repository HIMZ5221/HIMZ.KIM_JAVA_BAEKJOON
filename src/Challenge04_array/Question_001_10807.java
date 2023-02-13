package Challenge04_array;

import java.util.Scanner;

public class Question_001_10807 {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int[] ary = new int[sc.nextInt()];
		
		for(int i = 0; i<ary.length; i++) {
			ary[i] = sc.nextInt();
		}
		
		int point = sc.nextInt();
		int result = 0;
		for(int i = 0; i<ary.length; i++) {
			if(ary[i] == point) {
				result ++;
			}
		}
		System.out.println(result);
		
	}

}
