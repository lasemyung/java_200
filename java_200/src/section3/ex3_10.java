package section3;

import java.util.Scanner;

//입력한 정숫값을 3으로 나눈다. 그리고 그 결과에 따라 "이 값은 3으로 나누어집니다" "이 값을 3으로 나눈 나머지는 1입니다" " 이 값을 3으로 나눈 나머지는 2입니다" 중 하나를 표시하는 프로그램을 작성
public class ex3_10 {
	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		System.out.println("정수를 입력하세요");
		int a =scan.nextInt();
		
		if( a % 3 == 0)
			System.out.println("이 값은 3으로 나누어 집니다");
		else if ( a % 3 == 1) 
			System.out.println("이 값을 3으로 나눈 나머지는 1입니다");
		else if ( a % 3 == 2)
			System.out.println("이 값을 3으로 나눈 나머지는 2입니다");
		else
			System.out.println("음수를 입력하셨습니다.");
	}
}
