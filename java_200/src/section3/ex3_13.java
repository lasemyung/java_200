package section3;

import java.util.Scanner;

//2개의 정숫값을 읽어서 두 값의 차를 표시하는 프로그램 작성
public class ex3_13 {
	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		System.out.println("2개의 정수를 입력하세요");
		int a =scan.nextInt();
		int b =scan.nextInt();
		
		if ( a >=b) {
			System.out.println( a-b);
		} else 
	System.out.println( b-a);
		
		int diff=a >=b ? a-b :b-a;
		System.out.println("두 값의 차는" + diff + "입니다.");
	}
}
