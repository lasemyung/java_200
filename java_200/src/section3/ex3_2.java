package section3;
	//정숫값을 읽어서 절댓값을 구하는 프로그램을 작성

import java.util.Scanner;

public class ex3_2 {
	public static void main(String[] args) {
		Scanner scan =new Scanner(System.in);
			System.out.println("정숫값을 하나 입력해 주세요");
			int a = scan.nextInt();
			
			if( a>=0 ) {
				System.out.println("절댓값은 " + a + " 입니다.");
			} else 
				System.out.println("절댓값은 " + -a + " 입니다.");
			
			
	}

}
