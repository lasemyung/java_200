package section3;
//3개의 정숫값을 오름차순으로 정렬하는 프로그램 작성

import java.util.Scanner;

public class ex3_19 {
	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		System.out.println("3개의 정수를 입력하세요");
		int a =scan.nextInt();
		int b =scan.nextInt();
		int c =scan.nextInt();
		
		if(a>b) { //a가 b보다 크면 a와 b를 교환
			int t=a; a=b; b=t;
		}
		
		if(b>c) {// b가 c보다 크면 b와 c를 교환 
			int t =b; b=c; c=t;
		}
		
		if(a>b) {//a가 b보다 크면 a와 b를 교환
			int t=a; a=b; b=t;
		}
		
		System.out.println("a<=b<=c가 되도록 정렬했습니다");
		System.out.println("변수 a는"+a+"입니다.");
		System.out.println("변수 b는"+b+"입니다.");
		System.out.println("변수 c는"+c+"입니다.");
	}
}