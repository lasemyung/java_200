package section2;

import java.util.Scanner;

//키보드에서 입력한 정숫값을 표시하는 프로그램
public class ex2_5 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
				
				System.out.println("정숫값을 입력하세요");
		int x = scan.nextInt();
		System.out.println(x + "를 입력 했습니다");
	}
}
