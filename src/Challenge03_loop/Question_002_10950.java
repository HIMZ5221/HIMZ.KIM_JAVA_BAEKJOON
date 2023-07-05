package Challenge03_loop;

import java.util.Scanner;

public class Question_002_10950 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int loop = sc.nextInt();
		
		for(int i = 1; i<= loop ; i++) {
			int A = sc.nextInt();
			int B = sc.nextInt();
			System.out.println(A+B);
		}
		
		
		
		  //String a = sc.nextLine();        // 문자의 경우
        int b = Integer.parseInt(sc.nextLine());

        for(int i=0; i<b; i++) {
            int c = Integer.parseInt(sc.nextLine());
            int d = Integer.parseInt(sc.nextLine());

            System.out.println(c+d);
        }
	}

}
