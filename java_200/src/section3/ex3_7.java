package section3;

import java.util.Scanner;

// 2개의 변수 a,b에 값을 읽어서 a,b의 대소관계를 다음과 같이 표시하는 프로그램을 작성
	// "a가 크다." "b가 크다" "a와 b가 같다"
public class ex3_7 {
	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		System.out.println("정수 두개를 입력하세요");
		int a =scan.nextInt();
		int b =scan.nextInt();
		
		if( a <b) {
			System.out.println("b가 크다");
		} else if ( b <a) 
			System.out.println("a가 크다");
		 else 
			System.out.println("a와 b가 같다");
		
	}
}
