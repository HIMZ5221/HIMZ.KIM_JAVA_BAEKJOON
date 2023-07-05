package Challenge05_function;

import java.util.Scanner;

public class Question_004_11654 {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		String[] arr = new String[Integer.parseInt(sc.nextLine())];
		
		for (int i = 0; i < arr.length; i++) {
			arr[i] = (sc.nextLine());
		}
		for (int i = 0; i < arr.length; i++) {
			System.out.println(arr[i].substring(0,1)+arr[i].substring(arr[i].length()-1));
		}
	}
}
