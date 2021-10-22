package section4;

import java.util.Scanner;

//2개의 정숫값을 읽어서 두 정수 사이에 있는 모든 정숫값 작은 것부터 큰 순으로 표시하는 프로그램을 작성
public class ex4_4 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("두개의 정수를 입력해 주세요");
		int a=scan.nextInt(); 
		int b=scan.nextInt();
		if( a>b) {
			int t=a;
			a=b;
			b=t;
		}
		do {
			System.out.println(a+"");
			a=a+1;
		} while( a<=b);
			System.out.println();
	}
}
