package section3;

import java.util.Scanner;

// 3_3의 문제를 논리 부정 연산자를 통해서 수정하자
public class ex3_4 {
	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		System.out.println("정수 두개를 입력하세요");
		int a =scan.nextInt();
		int b =scan.nextInt();
		
		if(!( a % b == 0)) {
			System.out.println("B는 A의 약수가 아닙니다");
		} else 
		System.out.println("B는 A의 약수 입니다.");
	}
}
