package section3;

import java.util.Scanner;

// 2개의 실수값중 큰 값을 표시하는 프로그램 작성
public class ex3_12 {
public static void main(String[] args) {
	Scanner scan=new Scanner(System.in);
	System.out.println("2개의 정수를 입력하세요");
	int a =scan.nextInt();
	int b =scan.nextInt();
	
	if ( a > b) {
		System.out.println("a가 b보다 큽니다");
	} else if ( b > a) {
		System.out.println("b가 a보다 큽니다");
	} else if ( a ==b)
			System.out.println("a와 b는 같습니다");
	else 
		System.out.println("잘못된 정수를 입력했습니다");
	
	
}
}
