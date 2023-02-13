package Challenge01;

import java.util.Scanner;

public class Question_009_3003 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		
		int king = 1;
		int queen = 1;
		int look = 2;
		int bishop = 2;
		int knight = 2;
		int pawn = 8;
		
		king = king - sc.nextInt();
		queen = queen - sc.nextInt();
		look = look - sc.nextInt();
		bishop = bishop - sc.nextInt();
		knight = knight - sc.nextInt();
		pawn = pawn - sc.nextInt();
		
		System.out.println(king);
		System.out.println(queen);
		System.out.println(look);
		System.out.println(bishop);
		System.out.println(knight);
		System.out.println(pawn);
		
		
	}

}
