package section4;

import java.util.Scanner;

// 양의 정숫값을 0까지 카운트다운하는 문제 4-5를 for문으로 작성하라
public class ex4_12 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println(" 정수를 입력해 주세요");

		int x;
		do {
			System.out.println("양의 정수값:");
			x = scan.nextInt();
		} while (x <= 0);
		// do문 종료 시 x는 반드시 양의 값이 된다

		for(; x>=0; x--)
			System.out.println(x); //x값을 표시
		}
	}

