package Challenge02;

import java.util.Scanner;

public class Question_007_2480 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		
		int a = sc.nextInt();
		int b = sc.nextInt();
		int c = sc.nextInt();
		
		int result = 0;
		
		if(a == b && b == c) {
			result += 10000 + (a*1000);
			
		}else if(a == b || a == c) {
			result += 1000 + (a*100);
		}else if(b == c) {
			result += 1000 + (b*100);
		}else if(a != b && a != c && b != c) {
			if(a>b) {
				if(c>a) {
					result += c*100;
				}else {
					result += a*100;
				}
			}else if(c>b) {
				result += c*100;
			}else {
				result += b*100;
			}
		}
		
		
		
		System.out.println(result);
		

	}

}
