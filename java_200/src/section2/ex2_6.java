package section2;

import java.util.Scanner;

//키보드에서 입력한 정숫값에 10을 더합 값과 10을 뺀 값을 출력하자
public class ex2_6 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("정숫값을 입력하세요");
			int x = scan.nextInt(); 
			System.out.println( x + 10);
			System.out.println( x - 10);
	}
}
