package section3;

import java.util.Scanner;

// 2개의 양의 정숫값을 읽어서 후자가 전자의 약수이면 "B는 A의 약수이다" 라고 표시하고, 그렇지 않으면 "B는 A의 약수가 아니다"라고 표시하는 프로그램을 작성
public class ex3_3 {
	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		System.out.println("정수 두개를 입력하세요");
		int a =scan.nextInt();
		int b =scan.nextInt();
		
		if ( a % b == 0) {
			System.out.println("B는 A의 약수입니다");
		} else 
		System.out.println("B는 A의 약수가 아닙니다");
	}
}
