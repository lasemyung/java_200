package section4;

import java.util.Scanner;

// 프로그램을 수정해서 결과뿐만 아니라 계산식까지 표시하는 프로그램을 작성하자
public class ex4_15 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println(" 정수를 입력해 주세요");

		int x;
		do {
			System.out.println("양의 정수값:");
			x = scan.nextInt();
		} while (x <= 0);
		// do문 종료 시 x는 반드시 양의 값이 된다

		int sum = 0;
		for (int i = 1; i < x; i++) {
			System.out.print(i+" + ");
			sum += i;

		}
		
	System.out.println(x +" = ");
	sum += x;
	System.out.println(sum);
	}
}

