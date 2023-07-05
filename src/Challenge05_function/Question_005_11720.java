package Challenge05_function;

import java.util.Scanner;

public class Question_005_11720 {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int[] size = new int[sc.nextInt()];
		String a = sc.next();
		
		int sum = 0;
		for (int i = 0; i < size.length; i++) {
			sum += a.charAt(i)-'0';
		}
		System.out.println(sum);
	}
}
