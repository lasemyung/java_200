package section3;

import java.util.Scanner;

// 정수값을 읽어 부호를 판정하는 프로그램 작성
public class ex3_5 {
		public static void main(String[] args) {
			Scanner scan=new Scanner(System.in);
			System.out.println("정수를 입력하세요");
			int a =scan.nextInt();
			
			if ( a > 0) {
				System.out.println("양수입니다");
			} else if ( a < 0 ) {
				System.out.println("음수입니다");
			} else {
				System.out.println("0입니다");
			}
		}
}
