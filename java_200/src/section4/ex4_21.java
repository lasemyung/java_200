package section4;

import java.util.Iterator;
import java.util.Scanner;

//기호문자 * 을 나열해서 n단의 정방형을 표시하는 프로그램을 작성하자
public class ex4_21 {
	public static void main(String[] args) {
		Scanner stdIN = new Scanner(System.in);

		System.out.println("정방향을 표시합니다");
		System.out.print("단수는:");
		int n = stdIN.nextInt();

		for (int i = 1; i <= n; i++) {
			for (int j = 1; j <= n; j++) {
				System.out.print("*");
			}
			System.out.println();
		}
	}
}
