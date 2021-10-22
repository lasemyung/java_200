package section4;
//정숫값의 부호를 판정해서 표시하는 Sign 프로그램 문제3_5를 원하는 만큼 반복해서 입력 및 표시하도록 수정
	import java.util.Scanner;
	// 정수값을 읽어 부호를 판정하는 프로그램 작성
	public class ex4_1{
			public static void main(String[] args) {
				Scanner scan=new Scanner(System.in);
				int retry; //다시 시도
				
				
				do {
				System.out.println("정숫값 입력");
				int a =scan.nextInt();
				
				if ( a > 0) {
					System.out.println("양수입니다");
				} else if ( a < 0 ) {
					System.out.println("음수입니다");
				} else {
					System.out.println("0입니다");
				}
				
				System.out.println("다시한번 하시겠습니까? 1-yes / 0-no");
				retry=scan.nextInt();
			} while (retry==1);
	}
	}


