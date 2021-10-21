package section3;

import java.util.Scanner;

// 키보드로 입력받은 정숫값이 음의 값이면 "이 값은 음의 값입니다"라고 표시하는 프로그램
public class ex3_1 {
	public static void main(String[] args) {
		Scanner scan =new Scanner(System.in);
		
		System.out.println("정수를 하나 입력해주세요");
		int x =scan.nextInt();
		
		if ( x < 0) {
			System.out.println("이 값은 음의 값입니다");
		} 
	}
}
