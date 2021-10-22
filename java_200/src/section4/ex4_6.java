package section4;

import java.util.Scanner;

//문제 4-5에서 x--를 --x로 고치면 어떻게 출력이 되는지 검증하자
public class ex4_6 {
public static void main(String[] args) {
	Scanner scan = new Scanner(System.in);
	System.out.println("카운트다운 합니다");
	int x;
	do {
		System.out.println("양의 정수값:");
		x=scan.nextInt();
	}while(x<=0);
	//do문 종료 시 x는 반드시 양의 값이 된다
	
	while(x>=0) {
		System.out.println(x--);
		System.out.println("x의 값이"+x+"됐습니다");
	}
}
}
