package section2;

import java.util.Scanner;

// 2개의 실숫값을 입력받아 합과 평균을 구하는 프로그램
public class ex2_8 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("실숫값 입력");
	double x = scan.nextDouble();
	double y = scan.nextDouble();

		System.out.println("합계는" + (x + y)+ "입니다." );
		System.out.println("평균은" + (x + y)/2+ "입니다." );
	}
}
