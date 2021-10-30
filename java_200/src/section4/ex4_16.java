package section4;
	// 신장별 표준 체중 대응표를 표시하는 프로그램을 작성하자. 표시할 신장의 범위 ( 시작,종료,증가값)는 정숫값으로 입력 받을것.

import java.util.Scanner;

public class ex4_16 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("몇 cm부터:");
		int hMin = scan.nextInt();
		System.out.println("몇 cm까지:");
		int hMax = scan.nextInt();
		System.out.println("몇 cm 단위:");
		int step = scan.nextInt();
		System.out.println("신장 표준 체중");
		System.out.println("------------------");
		
		for ( int i=hMin; i<hMax; i+=step) {
			System.out.println(i+" "+ 0.9*(i-100));
		}
	}

	
}
