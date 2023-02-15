package Challenge04_array;

import java.util.Scanner;

public class Question_008_8958 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		String[] M = new String[sc.nextInt()];
		
		for(int i=0; i<M.length; i++) {
			M[i] = sc.next();
		}
		
		
		
		for(int i=0; i<M.length; i++) {
			
			int count = 0;
			int sum = 0;
			
			for (int j = 0; j < M[i].length(); j++) {
				
				if (M[i].charAt(j) == 'O') {
					count++;
				}
				else {
					count = 0;
				}
				sum += count;
			}
			
			System.out.println(sum);
		}
	
		
		
	}

}
