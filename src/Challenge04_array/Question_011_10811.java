package Challenge04_array;

import java.util.Iterator;
import java.util.Scanner;

public class Question_011_10811 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int[] arr = new int[sc.nextInt()];
		
		for (int i = 0; i < arr.length; i++) {
			arr[i] = i+1;
		}
		int loop = sc.nextInt();
		int count = 0;
		for (int i = 1; i <= loop; i++) {
			System.out.println("반복횟수 " + i);
			int min = sc.nextInt();
			int max = sc.nextInt();
			for (int j = min-1; j < (max-1)-((max-min)/2); j++) {
				System.out.println(j);
				int minValue = arr[j];
				int maxValue = arr[max-count-1];
				System.out.println("minValue: "+ minValue);
				System.out.println("minValue: "+ maxValue);
				
				arr[j] = maxValue;
				arr[max-count-1] = minValue;
				count += 1;
			}
			count = 0;
		} 
		
		for (int i = 0; i < arr.length; i++) {
			System.out.println(i+1 + "배열 결과값: "+arr[i]);
			
		}
		
	}

}
