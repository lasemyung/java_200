package section2;
		// 삼각형의 밑변과 높이를 입력받아 삼각형의 넓이를 구하는 프로그램을 작성

import java.util.Scanner;

public class ex2_9 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in); 
		System.out.println("밑변 입력");
		double x = scan.nextDouble();
		System.out.println(x);
		System.out.println("높이 입력");
		double y = scan.nextDouble();
		System.out.println(y);
		
		System.out.println("넓이는" + (x*y)/2 + "입니다.");
	}

}
