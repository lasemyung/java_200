package section3;

import java.util.Scanner;

// 2개의 정숫값을 내림차순으로 정렬하는 프로그램
public class ex3_18 {
public static void main(String[] args) {
	Scanner scan=new Scanner(System.in);
	System.out.println("2개의 정수를 입력하세요");
	int a =scan.nextInt();
	int b =scan.nextInt();
	
	if (a<b) {
		int c=a;
		a=b;
		b=c;
	}
	System.out.println("변수 a는"+a+"입니다.");
	System.out.println("변수 b는"+b+"입니다.");
}
}
