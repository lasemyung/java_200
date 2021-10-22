package section4;

import java.util.Scanner;

//양의 정숫값을 읽어서 그 자릿수를 출력하는 프로그램
public class ex4_9 {
public static void main(String[] args) {
	Scanner scan = new Scanner(System.in);
	System.out.println("정수를 입력해주세요");
	int a;
	do {
		System.out.println("양의 정숫값을 입력하세요");
		 a =scan.nextInt();
	} while( a <= 0 );
	
	int digit=0; //자릿수
	while( a>0) {
		digit++; //자릿수를 증가
		a /= 10;
	}
	System.out.println("입력한 숫자는" +digit+"자리 입니다.");
}
}
