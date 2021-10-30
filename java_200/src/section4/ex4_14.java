package section4;

import java.util.Scanner;
import java.util.function.BiConsumer;

//1부터 n까지의 합을 구하는 프로그램을 구하는 for문을 사용해 작성
public class ex4_14 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println(" 정수를 입력해 주세요");
		
		int x;
		do {
			System.out.println("양의 정수값:");
			x = scan.nextInt();
		} while (x <= 0);
		// do문 종료 시 x는 반드시 양의 값이 된다
		
		
		int sum=0;
		for(int i=1; i<=x; i++) {
			sum+=i;
			
		}
		System.out.println("1부터" + x + "까지의 합은" + sum + "입니다." );
	}
}
