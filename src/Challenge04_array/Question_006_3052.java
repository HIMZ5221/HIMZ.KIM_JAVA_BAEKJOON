package Challenge04_array;

import java.util.Scanner;

public class Question_006_3052 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		boolean[] ary = new boolean[42];
		int count = 0;
		
		for(int i=0; i<10; i++) {
			ary[(sc.nextInt())%42] = true;
		}
//		for(int i=0; i<ary.length; i++) {
//			if(ary[i] = true) {
//				count++;
//			}
//		}
		for(boolean value : ary) {
			if(value) {
				count++;
			}
		}
		
		System.out.println(count);
		
	}

}
