package Challenge04_array;

import java.util.Scanner;

public class Question_004_2562 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int[] arr = new int[9];
		int x = 0;
		int index = 0;
		
		for(int i=0; i<arr.length; i++) {
			arr[i] = sc.nextInt();
			if(arr[i]>x) {
				x = arr[i];
				index = i+1;
			}
		}

		System.out.println(x+" "+index);
		
	}

}
