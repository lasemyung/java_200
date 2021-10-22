package section4;

import java.util.Scanner;

//입력받은 정숫값부터 0까지 카운트다운하는 프로그램을 작성하라. 카운트다운 종료 후의 변숫값을 확인 할 수 있게 할 것
public class ex4_5 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println(" 정수를 입력해 주세요");
		int a=scan.nextInt(); 
		
		if( a>0) {
			do {
				a =a -1;
				System.out.println(a+"");
			} while(a>0);
			System.out.println("종료합니다.");
		}else 
			System.out.println("다시 시작해 주세요");
			
//위에는 내가 작성한 것
		
		int x;
		do {
			System.out.println("양의 정수값:");
			x=scan.nextInt();
		}while(x<=0);
		//do문 종료 시 x는 반드시 양의 값이 된다
		
		while(x>=0) {
			System.out.println(x--);
			System.out.println("x의 값이"+x+"됐습니다");
		}
	}
}
