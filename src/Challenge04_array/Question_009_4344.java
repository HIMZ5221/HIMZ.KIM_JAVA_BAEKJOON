package Challenge04_array;

import java.util.Scanner;

public class Question_009_4344 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int[] C = new int[sc.nextInt()];
		double[] parket = new double[C.length];
		
		for(int i=0; i<C.length;i++) {
			int count = sc.nextInt();
			double[] N = new double[count];
			double sum = 0; //평균을 구하기 위한 합계
			double point = 0; //평균보다 높은학생 카운트
			
			for(int j = 0; j<N.length; j++) {
				N[j] = sc.nextInt();
				sum += N[j];
			}
			
			for(int j = 0; j<N.length;j++) {
				if((sum/count)<N[j]) {
					point++;
				}
			}
			//parket[i] = (Math.round(point/(double)count*100000))/(double)1000;// 5나누기 9 곱하기 100이 들어가야 함
			System.out.printf("%.3f%%\n", (point/count)*100);  
		}
		
		
		
//		for(double ary : parket) {
//			System.out.println(ary+"%");
		//}
		
		
	}

}
