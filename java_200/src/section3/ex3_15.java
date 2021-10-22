package section3;

import java.util.Scanner;

//키보드에서 입력한 3개의 정숫값 중 최소값을 구하는 프로그램
public class ex3_15 {
	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		System.out.println("3개의 정수를 입력하세요");
		int a =scan.nextInt();
		int b =scan.nextInt();
		int c =scan.nextInt();
		
		int min =a;
		if( b <min) min=b;
		if(c<min) min=c ; 
		
		System.out.println("최솟값은" + min + "입니다.");
	}
}
