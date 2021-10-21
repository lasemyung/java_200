package section3;

import java.util.Scanner;

// 입력한 정수값이 10의 배수이면 " 이 값은 10의 배수입니다"라고 표시하고 그렇지 않으면 " 이 값은 10의 배수가 아닙니다" 라고 표시하는 프로그램을 작성 
public class ex3_9 {
	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		System.out.println("정수를 입력하세요");
		int a =scan.nextInt();
		
		if ( a > 0)
		if ( a % 10 == 0)
			System.out.println("이 값은 10의 배수입니다");
		else 
			System.out.println("이 값은 10의 배수가 아닙니다");
		else
			System.out.println("이 값은 음의 정수 입니다");
		
	}
}
