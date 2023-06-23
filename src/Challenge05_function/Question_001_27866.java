package Challenge05_function;

import java.util.Scanner;

public class Question_001_27866 {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		String a = sc.nextLine();
		int subNum = Integer.parseInt(sc.nextLine());
		System.out.println(a.substring((subNum-1),(subNum)));
	}
}
