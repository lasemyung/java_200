package section2;

import java.util.Scanner;

// 구의 겉넓이와 부피를 구하는 프로그램을 작성
public class ex2_10 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in); 
		final double pi = 3.1416;
		System.out.println("반지름 입력");
		double x = scan.nextDouble();
		System.out.println(x);
		
		System.out.println("구의 넓이는"+ ( 4*pi*x*x) + "입니다.");
		System.out.println("구의 부피는" + (4 / 3 *pi * x*x*x)+"입니다.");
	}
}
