package section4;

import java.util.Scanner;

// 양의 정숫값 n을 읽어서 1부터 n까지의 곱을 구하는 프로그램을 작성하자
public class ex4_10 {
public static void main(String[] args) {
	Scanner scan = new Scanner(System.in);
	int n;
	do {
		System.out.println("양의 정숫값을 입력하세요");
		n=scan.nextInt();
	}while(n<=0); // n을 양의 정수를 입력했으면 밑으로 이동
	
	int factorial=1;
	int i=1;
	
	while(i<=n) { // i가 입력한 값보다 작으면 팩토리얼에 i를 증감하면서 곱해주는 자승 알고리즘
		factorial *=i;
		i++;
	}
	System.out.println("1부터  " +n+"까지의 곱은"+factorial+"입니다.");
}
}
