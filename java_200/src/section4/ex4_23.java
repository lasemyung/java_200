package section4;

import java.io.InputStream;
import java.util.Scanner;

//n단 피라미드를 표시하는 프로그램을 작성해보자 i 행째에는 (i-1) *2+1개의 * 기호를 표시하고 마지막 행인
//n행째에는 (n-1)*2+1개의 *를 표시할 것
public class ex4_23 {
	public static void main(String[] args) {

		Scanner str = new Scanner(System.in);

		System.out.println("피라미드를 표시합니다");
		System.out.println("단수를 적어주세요 :");
		int n = str.nextInt();

		for (int i = 1; i <= n; i++) {
			for (int j = 1; j <= n - i; j++)
				System.out.print(' ');
			for (int j = 1; j <= 2 * i - 1; j++)
				System.out.print("*");
			System.out.println();

		}
	}
}
