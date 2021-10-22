package section3;

import java.util.Scanner;

//입력한 점수에 따라 수/우/미/양/가 를 판별하는 프로그램 작성
public class ex3_11 {
	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		System.out.println("점수를 입력하세요");
		int a =scan.nextInt();
		
		if( a <=100 && a >=80) {
			System.out.println("수");
		} else if ( a <80 && a>=60) {
			System.out.println("우");
		} else if ( a < 60 && a >= 40) {
			System.out.println("미");
		} else if ( a < 40 && a>=20) {
			System.out.println("양");
		} else if ( a <20 && a >=0) {
			System.out.println("가");
		} else
			System.out.println("잘못된 점수를 입력하셨습니다");
	}
}
