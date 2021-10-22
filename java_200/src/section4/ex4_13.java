package section4;

import java.util.Scanner;

//앞 문제와 반대로 0부터 양의 정수까지 카운트업하는 프로그램 작성
public class ex4_13 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println(" 정수를 입력해 주세요");

		int x;
		do {
			System.out.println("양의 정수값:");
			x = scan.nextInt();
		} while (x <= 0);
		// do문 종료 시 x는 반드시 양의 값이 된다

		for(int i=0; i<=x; i++)
			System.out.println(i); //x값을 표시
	}
}
