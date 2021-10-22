package section3;
	// 두 정수 값의 차가 10이하인 경우 "두 값의 차는 10 이하입니다" 라고 표시하고 그렇지 않으면 "두 값의 차는 11이상입니다"라고 표시하는 프로그램을 작성

import java.util.Scanner;

public class ex3_14 {
	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		System.out.println("2개의 정수를 입력하세요");
		int a =scan.nextInt();
		int b =scan.nextInt();
				
		int diff = a>=b ? a-b :b-a; 
		if(diff <=10)
			System.out.println("두 값의 차는 10이하입니다");
		else
			System.out.println("두 값의 차는 11이상입니다");
	}
	
}
	