package section4;

import java.util.Scanner;

//기호 문자를 임의의 개수만큼 출력했던 4-7을 for문으로 작성하자
public class ex4_11 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("정수를 입력해주세요");
		int a = scan.nextInt();
	
		if(a>0) {
			for(int i=0; i<a; i++) {
				System.out.print('*');
				
			}
		}
	}
}
