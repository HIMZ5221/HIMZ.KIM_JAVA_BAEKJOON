package Challenge04_array;

import java.util.Scanner;

public class Question_006_3052 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int[] ary = new int[10];
		
		for(int i = 0; i<ary.length; i++) {
			ary[i] = sc.nextInt();
			System.out.println(ary[i]);
		}
		
		int sw = ary[0]%42;
		System.out.println(sw);
		System.out.println(ary.length);

	}

}
