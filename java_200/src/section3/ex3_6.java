package section3;

import java.util.Scanner;

// 3_5에서 마지막 else를 else if(n==0)으로 변경하면 어떻게 되는지 확인하자
public class ex3_6 {
	
	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		System.out.println("정수를 입력하세요");
		int a =scan.nextInt();
		
		if ( a > 0) {
			System.out.println("양수입니다");
		} else if ( a < 0 ) {
			System.out.println("음수입니다");
		} else if ( a==0) {
			System.out.println("0입니다");
		}
	}
	}
	

