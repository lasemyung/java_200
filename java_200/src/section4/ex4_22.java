package section4;

import java.util.Scanner;

// 기호 문자 *를 나열해서 직각의 이등변 삼각형을 표시하는 프로그램을 작성
public class ex4_22 {
	public static void main(String[] args) {
		Scanner str = new Scanner(System.in);

		System.out.println("왼쪽 아래가 직각인 이등변 삼각형을 만듭니다");
		System.out.println("단수는? :");
		int n = str.nextInt();
		
		// 왼쪽 아래가 직각인 삼각형
		for (int i = 1; i <= n; i++) {
			for(int j=1; j<= i; j++) {
				System.out.print("*");
			}
			System.out.println();
		}
		
		//왼쪽 위가 직각인 삼각형
		for (int i = 1; i <= n; i++) {
			for (int j = 1; j <= n - i + 1; j++)
				System.out.print("*");
			System.out.println();
		}
	}
}
